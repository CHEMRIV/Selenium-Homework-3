package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Utility;

public class LoginTest extends Utility {
    String baseUrl = "https://courses.ultimateqa.com/";

    @Before
    public void setUp() {
        //open baseUrl
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        clickOnElement(By.xpath("//a[contains(text(),'Sign In')]"));
        assertVerifyText1(By.xpath("//h1[@class='page__heading']"),"Welcome Back!");
           }

    @Test
    public void verifyTheErrorMessage() {
        //click on signin link
        clickOnElement(By.xpath("//a[contains(text(),'Sign In')]"));
        // Enter invalid username
        sendTextToElement(By.id("user[email]"),"abc123@gmail.com");
        // Enter invalid password
        sendTextToElement(By.id("user[password]"),"123456");
        //Click on Login button
        clickOnElement(By.xpath("//input[@class='button button-primary g-recaptcha']"));
        //find out error massage display or not
        assertVerifyText1(By.xpath("//li[contains(text(),'Invalid email or password.')]"),"Invalid email or password.");

    }

    @After
    public void tearDown() {
        //closeBrowser()
    }
}
