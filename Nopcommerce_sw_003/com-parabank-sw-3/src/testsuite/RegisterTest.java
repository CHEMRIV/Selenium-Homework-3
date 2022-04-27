package testsuite;

import org.checkerframework.checker.signature.qual.Identifier;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.Utility;

public class RegisterTest extends Utility {

    String baseUrl = "https://parabank.parasoft.com/parabank/index.htm";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyThatSigningUpPageDisplay() {
        //find register button and click on it
        clickOnElement(By.xpath("//a[text()='Register']"));
        //verify the massage "Signing up is easy!"
        assertVerifyText1(By.xpath("//h1[@class='title']"), "Signing up is easy!");
    }

    @Test

        public void userShouldRegisterAccountSuccessfully () {
            // find and click on the ‘Register’ link
            clickOnElement(By.xpath("//a[text()='Register']"));
            // find firstname field and enter First name
            sendTextToElement(By.id("customer.firstName"), "Mitali");
            // find last name field and enter last name
            sendTextToElement(By.id("customer.lastName"), "Shah");
            // find address field and enter address
            sendTextToElement(By.id("customer.address.street"), "156,London Road");
            // find city field and enter city
            sendTextToElement(By.name("customer.address.city"), "London");
            // find state field and enter state
            sendTextToElement(By.id("customer.address.state"), "Greater London");
            // find zip code field and enter zip code
            sendTextToElement(By.id("customer.address.zipCode"), "WD458NW");
            // find phone field and enter phone
            sendTextToElement(By.id("customer.phoneNumber"), "7772589456");
            // find ssnField and enter SSN
            sendTextToElement(By.id("customer.ssn"), "NW152899IN");
            // find userNameField and enter userName
            sendTextToElement(By.id("customer.username"), "mitali");
            // find passwordField  and enter password
            sendTextToElement(By.id("customer.password"), "123456");
            // find confirm field and enter password again to confirm
            sendTextToElement(By.id("repeatedPassword"), "123456");
            // find and click on REGISTER button
            clickOnElement(By.xpath("(//input[@class='button'])[2]"));
            // Verify the text 'Your account was created successfully. You are now logged in.’
        assertVerifyText1(By.xpath("//p[text()='Your account was created successfully. You are now logged in.']"),"Your account was created successfully. You are now logged in.");

        }



    @After
    public void tearDown() {
        closeBrowser();
    }
}