package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.Utility;

public class LoginTest extends Utility {
    String baseUrl = "https://parabank.parasoft.com/parabank/index.htm";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //Enter username
        sendTextToElement(By.xpath("//div[@class='login']//input[@name='username']"), "mona");
        //enter password
        sendTextToElement(By.xpath("//div[@class='login']//input[@name='password']"), "123456");
        clickOnElement(By.xpath("//div[@class='login']//input[@type='submit']"));
        //match actul massage with expected
        assertVerifyText1(By.xpath("//h1[@class='title']"), "Accounts Overview");

    }

    @Test
    public void verifyTheErrorMessage() {
        //Enter username
        sendTextToElement(By.xpath("//div[@class='login']//input[@name='username']"), "Rutu");
        //enter password
        sendTextToElement(By.xpath("//div[@class='login']//input[@name='password']"), "128566");
        //login
        clickOnElement(By.xpath("//div[@class='login']//input[@type='submit']"));
        //match actul massage with expected
        assertVerifyText1(By.xpath("//p[@class='error']"), "The username and password could not be verified.");
    }

    @Test
    public void userShouldLogOutSuccessfully() {
        //Enter username
        sendTextToElement(By.xpath("//div[@class='login']//input[@name='username']"), "mona");
        //enter password
        sendTextToElement(By.xpath("//div[@class='login']//input[@name='password']"), "123456");
        clickOnElement(By.xpath("//div[@class='login']//input[@type='submit']"));
        //logout
        clickOnElement(By.xpath("//a[contains(text(),'Log Out')]"));
        // verify  actual massage with expected
        assertVerifyText1(By.xpath("//h2[contains(text(),'Customer Login')]"),"Customer Login");

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}