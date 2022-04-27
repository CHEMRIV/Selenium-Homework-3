package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.Utility;

import java.util.List;

public class LoginTest extends Utility {
    String baseUrl = "https://www.saucedemo.com/";

    @Before
    public void setUp() {
        //open baseUrl
        openBrowser(baseUrl);
    }

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {
        //Enter email id
        sendTextToElement(By.id("user-name"),"standard_user");
        //Enter password
        sendTextToElement(By.id("password"),"secret_sauce");
        //log in
        clickOnElement(By.id("login-button"));
        //Check icon 'PRODUCTS'
        assertVerifyText1(By.xpath("//span[contains(text(),'Products')]"),"PRODUCTS");
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        //Enter email id
        sendTextToElement(By.id("user-name"),"standard_user");
        //Enter password
        sendTextToElement(By.id("password"),"secret_sauce");
        //log in
        clickOnElement(By.id("login-button"));
        //count 'PRODUCTS' on webpage by using item label
        List<WebElement> productsList = driver.findElements(By.className("inventory_item_label"));
        int sizeOfList = productsList.size();
        System.out.println("Count of products displayed on page is : "+sizeOfList);

    }

    @After
    public void tearDown() {
        closeBrowser();
 }
}
