package testsuiteOrange;

import BrowseFactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String BaseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp(){
        openBrowser(BaseUrl);

    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        Driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");

Driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");

 Driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();


        String expectedMessage = "Welcome";
        String actualMessage = Driver.findElement(By.xpath("//div[@class='orangehrm-login-logo-mobile']//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']")).getText();
        //String actualMessage = String.valueOf(Driver.findElement(By.xpath("//div[@class='orangehrm-login-logo-mobile']//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']")).getClass());
        System.out.println(actualMessage);
        Assert.assertEquals("Verifying WelcomeMessage",expectedMessage,actualMessage);

    }

@After
    public void tearDown(){
        closeBrowser();
}


}
