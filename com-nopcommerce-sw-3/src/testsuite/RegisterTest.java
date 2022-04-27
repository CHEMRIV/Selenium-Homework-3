package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.UtilityClass;

public class RegisterTest extends UtilityClass {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        //click on Register button
        clickOnElement(By.linkText("Register"));
        //Verify the text ‘Register’
        String expectedText = "Register";
        String actualText = getTextFromElement(By.linkText("Register"));
        //Validation of actual and expected results
        Assert.assertEquals("Not Match with expected results", actualText, expectedText);
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        //click on Register button
        clickOnElement(By.linkText("Register"));
        //click on gender male button
        clickOnElement(By.id("gender-male"));
        //click on gender female button
        clickOnElement(By.id("gender-female"));
        //fill first name
        sendTextToElement(By.xpath("//input[@id='FirstName']"), "Pooja");
        //fill last name
        sendTextToElement(By.xpath("//input[@name='LastName']"), "Patel");
        //select date of birth-Day
        sendTextToElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]"), "28");
        //select date of birth-Month
        sendTextToElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]"), "April");
        //select date of birth-Year
        sendTextToElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]"), "1991");
        //email
        sendTextToElement(By.xpath("//input[@id='Email']"), "pooja321@gmail.com");
        //password
        sendTextToElement(By.xpath("//input[@id='Password']"), "123456");
        //Conformed password
        sendTextToElement(By.xpath("//input[@id='ConfirmPassword']"), "123456");
        //click in registration
        clickOnElement(By.xpath("//button[@id='register-button']"));
        //verify text massage
        String expectedText = "Your registration completed";
        String actualText = getTextFromElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
        //Validation of actual and expected results
        Assert.assertEquals("Not Match with expected results", actualText, expectedText);
    }

    @After
    public void teardown() {
        closeBrowser();
    }
}