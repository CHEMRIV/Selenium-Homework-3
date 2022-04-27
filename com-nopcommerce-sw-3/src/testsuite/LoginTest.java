package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.UtilityClass;

public class LoginTest extends UtilityClass {
    String baseUrl = "https://demo.nopcommerce.com/";

    //opening browser
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        clickOnElement(By.linkText("Log in"));
        //expected results
        String expectedMessage = "Welcome, Please Sign In!";
        //Find the welcome text element and get the text
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        //Validation of actual and expected results
        Assert.assertEquals("Not navigate to login page", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        clickOnElement(By.linkText("Log in"));
        //Find email element
        sendTextToElement(By.id("Email"), "pooja321@gmail.com");
        //Find password elements
        sendTextToElement(By.name("Password"), "123456");
        //log in
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));
        //verify expected results
        String expectedText = "Log out";
        //Find the welcome text element and get the text
        String actualText = getTextFromElement(By.xpath("//a[contains(text(),'Log out')]"));
        //Validation of actual and expected results
        Assert.assertEquals("Not navigate to login page", expectedText, actualText);
    }

    @Test
    public void verifyTheErrorMessage() {
        clickOnElement(By.linkText("Log in"));
        //Find email element
        sendTextToElement(By.id("Email"), "rutu321@gmail.com");
        //Find password elements
        sendTextToElement(By.name("Password"), "654123");
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));
        //expected results
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        //Find the welcome text element and get the text
        String actualMessage = getTextFromElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]"));

        //Validation of actual and expected results
        Assert.assertEquals("Not navigate to login page", expectedMessage, actualMessage);
    }

    //Close browser
    @After
    public void tearDown() {
        // closeBrowser();
    }
}
