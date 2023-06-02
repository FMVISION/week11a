package testsuitesaucedemo;

import BrowseFactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String BaseUrl = "https://www.saucedemo.com/ ";

    @Before
    public void setUp() {
        openBrowser(BaseUrl);
    }

    @Test

    public void userShouldLoginSuccessfullyWithValidCredentials() {

        Driver.findElement(By.xpath("//id[@id='user-name']")).sendKeys("stander_user");
        Driver.findElement(By.xpath("//div[@class='form_group']//id[@id='password']")).sendKeys("secret_sauce");
        Driver.findElement(By.xpath("//div[@id='login_button_container']")).click();
        String actualMessage = Driver.findElement(By.xpath("//div[@class=\"title\"']")).getText();
        String expectedMessage = "verify Products";
        System.out.println(actualMessage);
        Assert.assertEquals("Verify Products", expectedMessage, actualMessage);

    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){

        Driver.findElement(By.xpath("//id[@id='user-name']")).sendKeys("stander_user");
        Driver.findElement(By.xpath("//div[@class='form_group']//id[@id='password']")).sendKeys("secret_sauce");
        Driver.findElement(By.xpath("//div[@id='login_button_container']")).click();
        //List<WebElement> list = Driver.findElement(By.xpath("//div[@class='header_secondary_container']/span[@class='title']")).getText();
       String actualMessage = Driver.findElement(By.xpath("//div[@class=\"title\"']")).getText();
        String expectedMessage = "verify six Products";
        System.out.println(actualMessage);
        Assert.assertEquals("Verify six Products", expectedMessage, actualMessage);



    }
@After
    public void tearDown(){
        closeBrowser();

}
}
