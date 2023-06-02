package testsuitenopCommerce;

import BrowseFactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest extends BaseTest {

    String BaseUrl = " https://demo.nopcommerce.com/";
    private Object WebElement;

    @Before

    public void setUp() {
        openBrowser(BaseUrl);
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {

        Driver.findElement(By.xpath("//a[@href = '/register?returnUrl=%2F']")).click();          //register page
        //  Driver.findElement(By.xpath("//div[@class = 'inputs']//div[@id='gender']//span[@class ='male']//input[@id='gender-male']")).click();   // select gender male
        Driver.findElement(By.xpath("//div[@class = 'inputs']//div[@id='gender']//span[@class ='female']//input[@id='gender-female']")).click();    // select gender female

        Driver.findElement(By.xpath("//div[@class ='inputs']//input[@id ='FirstName']")).sendKeys("asdefgr");  // enter firstname

        Driver.findElement(By.xpath("//div[@class='inputs']//input[@id='LastName']")).sendKeys("123456");  // enter lastname

//Select for date of birth
        WebElement dropDown = Driver.findElement(By.xpath("//div[@class='date-picker-wrapper']//select[@name='DateOfBirthDay']"));
        Select select = new Select(dropDown);
        select.selectByValue("2"); // select by value

        WebElement emailField = Driver.findElement(By.xpath("//div[@class='inputs']//input[@type='email']"));   // email id
        emailField.sendKeys("codebuster@gmail.com");

        WebElement password = Driver.findElement(By.xpath("//div[@class='inputs']//input[@type='password']"));   // password
        password.sendKeys("123456");

        //confirm password
        Driver.findElement(By.xpath("//div[@class='inputs']//input[@type='password']")).sendKeys("123456");

        Driver.findElement(By.xpath("//div[@class='buttons']//button[@id='register-button']")).click();


    }


        @After
        public void tearDown (){
        closeBrowser();
}
        }
