package co.com.mecadolibre.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumWebDriver {
    public static WebDriver driver;

    public static void chromeDriver(String url) {

        ChromeOptions chromeOptions = new ChromeOptions();

        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--ignore-certificate-errors");
        chromeOptions.addArguments("--disable-infobars");
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--disable-site-isolation-trials");

        driver = new ChromeDriver(chromeOptions);
        driver.get(url);
    }

}
