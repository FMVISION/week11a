package testsuitenopCommerce;

import BrowseFactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {


    String BaseUrl = "https://demo.nopcommerce.com/ ";
Alert WelcomeMessage;
    @Before
    public void setUp() {
        openBrowser(BaseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() throws InterruptedException {

        Driver.findElement(By.className("ico-login")).click();

 Driver.findElement(By.xpath("//div[@class='page-title']//h1,'Welcome,'Please Sign in']"));

        String actualMessage = WelcomeMessage.getText();
        String expectedMessage = "Welcome,Please Sign In";
        Assert.assertEquals("Verifying WelcomeMessage",expectedMessage,actualMessage);

        Driver.findElement(By.xpath("//div[@class='inputs']//input[@type='email']")).sendKeys("codebuster@gmail.com");

        Driver.findElement(By.xpath("//div[@class='inputs']//input[@type='Password']")).sendKeys("123456");
Driver.findElement(By.xpath("//a[@href=\"/logout\"]")).click();




    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
