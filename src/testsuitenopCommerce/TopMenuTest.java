package testsuitenopCommerce;

import BrowseFactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {
    String BaseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(BaseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){

        Driver.findElement(By.xpath("//a[@href=\"/computers\"]")).click();
        String expectedMessage = "Computers";
        String actualMessage = Driver.findElement(By.xpath("//div[@class='page-title']//h1[1]")).getText();
        System.out.println(actualMessage);
        Assert.assertEquals("Verifying WelcomeMessage",expectedMessage,actualMessage);

    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){

        Driver.findElement(By.xpath("//a[@href=\"/electronics\"]")).click();
        String expectedMessage = "Electronics";
        String actualMessage = Driver.findElement(By.xpath("//div[@class='page-title']//h1[1]")).getText();
        System.out.println(actualMessage);
        Assert.assertEquals("Verifying WelcomeMessage",expectedMessage,actualMessage);

    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){

        Driver.findElement(By.xpath("//a[@href=\"/apparel\"]")).click();
        String expectedMessage = "Apparel";
        String actualMessage = Driver.findElement(By.xpath("//div[@class='page-title']//h1[1]")).getText();
        System.out.println(actualMessage);
        Assert.assertEquals("Verifying WelcomeMessage",expectedMessage,actualMessage);

    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){

        Driver.findElement(By.xpath("//a[@href=\"/digital-downloads\"]")).click();
        String expectedMessage = "Digital downloads";
        String actualMessage = Driver.findElement(By.xpath("//div[@class='page-title']//h1[1]")).getText();
        System.out.println(actualMessage);
        Assert.assertEquals("Verifying WelcomeMessage",expectedMessage,actualMessage);

    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){

        Driver.findElement(By.xpath("//a[@href=\"/books\"]")).click();
        String expectedMessage = "Books";
        String actualMessage = Driver.findElement(By.xpath("//div[@class='page-title']//h1[1]")).getText();
        System.out.println(actualMessage);
        Assert.assertEquals("Verifying WelcomeMessage",expectedMessage,actualMessage);

    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){

        Driver.findElement(By.xpath("//a[@href=\"/jewelry\"]")).click();
        String expectedMessage = "Jewelry";
        String actualMessage = Driver.findElement(By.xpath("//div[@class='page-title']//h1[1]")).getText();
        System.out.println(actualMessage);
        Assert.assertEquals("Verifying WelcomeMessage",expectedMessage,actualMessage);

    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){

        Driver.findElement(By.xpath("//a[@href=\"/gift-cards\"]")).click();
        String expectedMessage = "Gift Cards";
        String actualMessage = Driver.findElement(By.xpath("//div[@class='page-title']//h1[1]")).getText();
        System.out.println(actualMessage);
        Assert.assertEquals("Verifying WelcomeMessage",expectedMessage,actualMessage);

    }

   @After
   public void tearDown()
   {
      closeBrowser();
   }
}
