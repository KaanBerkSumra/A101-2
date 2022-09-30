
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

    public static WebDriver driver;
    static ChromeOptions chromeOptions;

    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver(chromeOptions());

    }
    public static ChromeOptions chromeOptions() {
        chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--start-fullscreen");
        return chromeOptions;
    }
    @AfterClass
    public static void tearDown(){
        driver.quit();
    }
}
