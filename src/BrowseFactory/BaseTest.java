package BrowseFactory;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BaseTest {
public static WebDriver Driver;

    public void openBrowser(String BaseUrl){
        ChromeOptions options = new ChromeOptions();
        Driver = new ChromeDriver(options);
        Driver.get(BaseUrl);
        Driver.manage().window().maximize();
        Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));


    }
    @After
public void closeBrowser() {
     Driver.quit();
}
}
