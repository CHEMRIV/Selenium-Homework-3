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
    String baseUrl = "http://the-internet.herokuapp.com/login";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //Enter email id
        sendTextToElement(By.id("username"),"tomsmith");
        //Enter password
        sendTextToElement(By.id("password"),"SuperSecretPassword!");
        //log in
        clickOnElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));
       }

    @Test
    public void verifyTheUsernameErrorMessage() {
        //Enter email id
        sendTextToElement(By.id("username"),"tomsmith1");
        //Enter password
        sendTextToElement(By.id("password"),"SuperSecretPassword!");
        //log in
        clickOnElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));
        //Check text 'Your username is invalid!'
        assertVerifyText2(By.xpath("//div[@id='flash']"),"Your username is invalid!");

    }

    @Test
    public void verifyThePasswordErrorMessage() {
        //Enter email id
        sendTextToElement(By.id("username"),"tomsmith");
        //Enter password
        sendTextToElement(By.id("password"),"SuperSecretPassword");
        //log in
        clickOnElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));
        //Check text 'Your username is invalid!'
        assertVerifyText2(By.xpath("//div[@id='flash']"),"Your password is invalid!");
         }

    @After
    public void tearDown() {
        closeBrowser();
    }

}


