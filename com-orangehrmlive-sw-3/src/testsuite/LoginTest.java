package testsuite;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.UtilityClass;

public class LoginTest extends UtilityClass {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //Enter email id
        sendTextToElement(By.id("txtUsername"), "Admin");
        //Enter password
        sendTextToElement(By.name("txtPassword"), "admin123");
        //log in
        clickOnElement(By.xpath("//input[@id='btnLogin']"));
    }
        @After
    public void tearDown(){
       // closeBrowser();
}

    }


