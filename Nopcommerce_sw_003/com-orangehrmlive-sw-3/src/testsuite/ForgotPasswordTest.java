package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.UtilityClass;

public class ForgotPasswordTest extends UtilityClass {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        clickOnElement(By.xpath("//a[contains(text(),'Forgot your password?')]"));
        String expectedText="Forgot Your Password?";
        String actualText = getTextFromElement(By.xpath("//h1[contains(text(),'Forgot Your Password?')]"));
        //Validation
        Assert.assertEquals("Not match found",expectedText,actualText);
    }
    @After
    public void tearDown(){
        driver.close();
    }


}
