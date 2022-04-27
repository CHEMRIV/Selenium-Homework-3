package browsefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class BaseTest  {
    public static WebDriver driver;

    public void openBrowser(String baseUrl) {
        //Browser code
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        //open browser
        driver.get(baseUrl);
        // Maximise Window
        driver.manage().window().maximize();
        // We give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


    }
    public void closeBrowser(){
        driver.close();
    }

}
