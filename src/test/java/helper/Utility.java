package helper;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class Utility {

    public static WebDriver driver;

    public static void startDriver(){
        ChromeOptions options = new ChromeOptions();
        FirefoxOptions options1 = new FirefoxOptions();
//        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver(options);
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver(options1);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    public static void quitDriver(){
        driver.quit();
    }
}
