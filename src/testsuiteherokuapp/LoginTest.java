package testsuiteherokuapp;

import BrowseFactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String BaseUrl = "http://the-internet.herokuapp.com/login";


    @Before
    public void setUp(){
        openBrowser(BaseUrl);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {

        Driver.findElement(By.xpath("//input[@type='text']")).sendKeys("tomsmith");
        Driver.findElement(By.xpath("//input[@type='password']")).sendKeys("SuperSecretPassword!");
        Driver.findElement(By.xpath("//button[@class=\"radius\"]")).click();

        String actualMessage = Driver.findElement(By.xpath("//h4[@class='subheader']")).getText();
        String expectedMessage = " Welcome to the Secure Area.When you are done click logout below";
        System.out.println("actual message");
        Assert.assertEquals("Verify Secure Area", expectedMessage, actualMessage);
    }

    @Test
    public void verifyTheUsernameErrorMessage(){

        Driver.findElement(By.xpath("//div[@id='flash-messages']//div[@class='flash error']")).sendKeys("tomsmith1");
        Driver.findElement(By.xpath("//input[@type='password']")).sendKeys("SuperSecretPassword!");

        String actualMessage = Driver.findElement(By.xpath("/div[@class='flash error']")).getText();
        String expectedMessage = "Your username is invalid";
        Assert.assertNotEquals("verify invalid username", expectedMessage,actualMessage);



    }

@Test
public void verifyThePasswordErrorMessage(){
Driver.findElement(By.xpath("//input[@type='text']")).sendKeys("tomsmith");
Driver.findElement(By.xpath("//div[@id='flash-messages']//div[@class='flash error']")).sendKeys("SuperSecretPassword");
String actualMessage = Driver.findElement(By.xpath("/div[@class='flash error']")).getText();
String expectedMessage = "Your password is invalid";
        Assert.assertNotEquals("verify invalid password", expectedMessage,actualMessage);


    }
@After
    public void tearDown(){
        closeBrowser();
    }

}
