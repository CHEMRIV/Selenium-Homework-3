package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.UtilityClass;

public class TopMenuTest extends UtilityClass {
    String baseUrl = "https://demo.nopcommerce.com/";

    //opening browser
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        //click on computer tab on tab manu
        clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]"));
        //Verify the text ‘Computers’
        String expectedText = "Computers";
        String actualText = getTextFromElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]"));
        //Validation of actual and expected results
        Assert.assertEquals("Not Match with expected results", actualText, expectedText);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        //click on electronics tab on tab manu
        clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]"));
        //Verify the text ‘Electronics’
        String expectedText = "Electronics";
        String actualText = getTextFromElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]"));
        //validation of actual and expected results
        Assert.assertEquals("Not Match with expected results", actualText, expectedText);
    }

    @Test
    public void serShouldNavigateToApparelPageSuccessfully() {
        //click on Apparel tab on tab manu
        clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/a[1]"));
        //Verify the text ‘Apparel’
        String expectedText = "Apparel";
        String actualText = getTextFromElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/a[1]"));
        //validation of actual and expected results
        Assert.assertEquals("Not Match with expected results", actualText, expectedText);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        //click on Digital downloads tab on tab manu
        clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[4]/a[1]"));
        //Verify the text ‘Digital downloads’
        String expectedText = "Digital downloads";
        String actualText = getTextFromElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[4]/a[1]"));
        //validation of actual and expected results
        Assert.assertEquals("Not Match with expected results", actualText, expectedText);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        //click on Books tab on tab manu
        clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[5]/a[1]"));
        //Verify the text ‘Books’
        String expectedText = "Books";
        String actualText = getTextFromElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[5]/a[1]"));
        //validation of actual and expected results
        Assert.assertEquals("Not Match with expected results", actualText, expectedText);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        //click on Jewelry tab on tab manu
        clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[6]/a[1]"));
        //Verify the text ‘Jewelry’
        String expectedText = "Jewelry";
        String actualText = getTextFromElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[6]/a[1]"));
        //validation of actual and expected results
        Assert.assertEquals("Not Match with expected results", actualText, expectedText);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        //click on Gift Cards tab on tab manu
        clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[7]/a[1]"));
        //Verify the text ‘Gift Cards’
        String expectedText = "Gift Cards";
        WebElement actualTextElement = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[7]/a[1]"));
        String actualText = getTextFromElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[7]/a[1]"));
        //validation of actual and expected results
        Assert.assertEquals("Not Match with expected results", actualText, expectedText);
    }

    //Close browser
    @After
    public void tearDown() {
        closeBrowser();
    }
}