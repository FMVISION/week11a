package testsuitecourses;

import BrowseFactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {

    String BaseUrl = "https://courses.ultimateqa.com/";

    @Before
    public void setUp() {
openBrowser(BaseUrl);
    }
    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        Driver.findElement(By.xpath("//a[@href='/users/sign_in']")).click();
        String actualMessage = Driver.findElement(By.xpath("//a[@href='/users/sign_in']")).getText();


String expectedMessage ="Welcome Back";
        System.out.println(actualMessage);
        Assert.assertEquals("Verify Message",expectedMessage,actualMessage);

    }

    @Test
    public void verifyTheErrorMessage(){
        Driver.findElement(By.xpath("//a[@href='/users/sign_in']")).click();
        Driver.findElement(By.xpath("//div[@class='form__group']//label[@for='user[email']//p[@id='user[email]-error']")).sendKeys("codebuster@gmail.com");
        Driver.findElement(By.xpath("//div[@class='form__group']//label[@for='user[password']//p[@id='user[password]-error']")).sendKeys("147568");
        String actualMessage = Driver.findElement(By.xpath("//div[@id='notice']")).getText();
        String expectedMessage = "Invalid email or password";
        System.out.println(actualMessage);
        Assert.assertEquals("Verify the error message",expectedMessage,actualMessage);

    }

@After
    public void tearDown(){
        closeBrowser();
}

}
