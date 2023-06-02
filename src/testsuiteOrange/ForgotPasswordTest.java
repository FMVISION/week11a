package testsuiteOrange;

import BrowseFactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {

    String BaseUrl = "https://opensource-demo.orangehrmlive.com/";


    @Before
    public void setUp() {
        openBrowser(BaseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){

        Driver.findElement(By.xpath("//div[@class=\"oxd-form-actions orangehrm-login-action\"']")).click();
        String actualMessage = Driver.findElement(By.xpath("//button[@type=\"submit\"]")).getText();
        String expectedMessage = "Login Successfully";

        System.out.println("actualMessage");
        Assert.assertEquals("Verifying Message",expectedMessage,actualMessage);
    }

    @Test
    public void ForgotPasswordPageSuccessfully(){
        Driver.findElement(By.xpath("//div[@class='orangehrm-login-forgot']//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
        String actualMessage = Driver.findElement(By.xpath("//div[@class='orangehrm-login-forgot']//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).getText();

        String expectedMessage = "Forgot Your Password";

        System.out.println("actualMessage");
        Assert.assertEquals("Verifying Message",expectedMessage,actualMessage);

    }



@After
    public void tearDown(){
        closeBrowser();

}
}