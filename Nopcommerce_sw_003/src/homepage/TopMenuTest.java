package homepage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    public void selectMenu(String name) {
        if (name == "Computers") {
            //find computer tab and click
            clickOnElement(By.linkText("Computers"));
            //validate actual and expected text
            assertVerifyText(By.tagName("h1"), "Computers");
        } else if (name == "Electronics") {
            clickOnElement(By.linkText("Electronics"));
            assertVerifyText(By.tagName("h1"), "Electronics");
        } else if (name == "Apparel") {
            clickOnElement(By.linkText("Apparel"));
            assertVerifyText(By.xpath("//h1[contains(text(),'Apparel')]"), "Apparel");
        } else if (name == "Digital downloads") {
            clickOnElement(By.linkText("Digital downloads"));
            assertVerifyText(By.xpath("//h1[contains(text(),'Digital downloads')]"), "Digital downloads");
        } else if (name == "Books") {
            clickOnElement(By.linkText("Books"));
            assertVerifyText(By.xpath("//h1[contains(text(),'Books')]"), "Books");
        } else if (name == "Jewelry") {
            clickOnElement(By.linkText("Jewelry"));
            assertVerifyText(By.xpath("//h1[contains(text(),'Jewelry')]"), "Jewelry");
        } else if (name == "Gift Cards") {
            clickOnElement(By.xpath("//a[contains(text(),'Gift Cards')]"));
            assertVerifyText(By.xpath("//h1[contains(text(),'Gift Cards')]"), "Gift Cards");
        } else {
            System.out.println("Please enter valid Top-menu name or check actual Top-menu name");
        }
    }

    public void assertVerifyText(By h1, String computers) {
    }

    @Test
    public void verifyPageNavigation() {
        selectMenu("Computers");
        selectMenu("Electronics");
        selectMenu("Apparel");
        selectMenu("Digital downloads");
        selectMenu("Books");
        selectMenu("Jewelry");
        selectMenu("Gift Cards");
    }
}
