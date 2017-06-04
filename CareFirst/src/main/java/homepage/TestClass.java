package homepage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sharif on 6/1/2017.
 */
public class TestClass{
    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sharif\\development\\HealthCareAutomation\\Generic\\driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.navigate().to("https://healthfirst.org/");
        driver.manage().window().maximize();

        //Thread.sleep(3000);
        driver.findElement(By.cssSelector("#menu-item-424 > a")).click();

    }
}
