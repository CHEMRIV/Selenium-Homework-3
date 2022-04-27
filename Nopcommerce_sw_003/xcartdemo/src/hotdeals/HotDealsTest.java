package hotdeals;

import homepage.Utility;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;

public class HotDealsTest extends Utility {
    String baseUrl = "https://mobile.x-cart.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifySaleProductsArrangeAlphabetically() throws MoveTargetOutOfBoundsException {
        //Mouse hover on the “Hot deals” link  and click “Sale”  link
        mouseHoverOnElement(By.xpath("//div[@class='collapse navbar-collapse']/ul/li[2]/span"));
        clickOnMouseHoverOnElement(By.xpath("//*[@id=\"header-area\"]/div[1]/div/div[4]/div/ul/li[2]/ul/li[1]/a"));
        // Verify the text “Sale”
        assertVerifyText1(By.id("page-title"), "Sale");
        //Mouse hover on “Sort By” and select “Name A-Z”
        mouseHoverOnElement(By.xpath("//div[@class='sort-box']"));
        clickOnMouseHoverOnElement(By.linkText("Name A - Z"));
        }

    @Test
    public void verifySaleProductsPriceArrangeLowToHigh() {
        //Mouse hover on the “Hot deals” link  and click “Sale”  link
        mouseHoverOnElement(By.xpath("//div[@class='collapse navbar-collapse']/ul/li[2]/span"));
        clickOnMouseHoverOnElement(By.xpath("//*[@id=\"header-area\"]/div[1]/div/div[4]/div/ul/li[2]/ul/li[1]/a"));
        //Verify the text “Sale”
        assertVerifyText1(By.id("page-title"), "Sale");
        //Mouse hover on “Sort By” and select “Price Low-High”
        mouseHoverOnElement(By.xpath("//div[@class='sort-box']"));
        clickOnMouseHoverOnElement(By.linkText("Name A - Z"));
       }

    @Test
    public void verifySaleProductsArrangeByRates() {
        //Mouse hover on the “Hot deals” link  and click “Sale”  link
        mouseHoverOnElement(By.xpath("//div[@class='collapse navbar-collapse']/ul/li[2]/span"));
        clickOnMouseHoverOnElement(By.xpath("//*[@id=\"header-area\"]/div[1]/div/div[4]/div/ul/li[2]/ul/li[1]/a"));
        //Verify the text “Sale”
        assertVerifyText1(By.id("page-title"), "Sale");
        //Mouse hover on “Sort By” and select “Rates”
        mouseHoverOnElement(By.xpath("//div[@class='sort-box']"));
        clickOnMouseHoverOnElement(By.linkText("Rates"));
        //Verify that the product’s arrange Rates
    }

    @Test
    public void verifyBestSellersProductsArrangeByZToA() {
        //Mouse hover on the “Hot deals” link
        mouseHoverOnElement(By.xpath("//div[@class='collapse navbar-collapse']/ul/li[2]/span"));
        clickOnMouseHoverOnElement(By.xpath("//*[@id=\"header-area\"]/div[1]/div/div[4]/div/ul/li[2]/ul/li[2]/a/span"));
        assertVerifyText1(By.id("page-title"), "Bestsellers");
        //Mouse hover on “Sort By” and select “Name Z-A”
        mouseHoverOnElement(By.xpath("//div[@class='sort-box']"));
        clickOnMouseHoverOnElement(By.linkText("Name Z - A"));

    }

    @Test
    public void verifyBestSellersProductsPriceArrangeHighToLow() {
        //Mouse hover on the “Hot deals” link
        mouseHoverOnElement(By.xpath("//div[@class='collapse navbar-collapse']/ul/li[2]/span"));
        //Mouse hover on the “Bestsellers” link and click
        clickOnMouseHoverOnElement(By.xpath("//*[@id=\"header-area\"]/div[1]/div/div[4]/div/ul/li[2]/ul/li[2]/a/span"));
       //Verify the text “Bestsellers”
        assertVerifyText1(By.id("page-title"), "Bestsellers");
        //Mouse hover on “Sort By” and select “Price High-Low”
        mouseHoverOnElement(By.xpath("//div[@class='sort-box']"));
        clickOnMouseHoverOnElement(By.linkText("Price High - Low"));
    }

    @Test
    public void verifyBestSellersProductsArrangeByRates() {
        //Mouse hover on the “Hot deals” link
        mouseHoverOnElement(By.xpath("//div[@class='collapse navbar-collapse']/ul/li[2]/span"));
        //Mouse hover on the “Bestsellers” link and click
        clickOnMouseHoverOnElement(By.xpath("//*[@id=\"header-area\"]/div[1]/div/div[4]/div/ul/li[2]/ul/li[2]/a/span"));
        //Verify the text “Bestsellers”
        assertVerifyText1(By.id("page-title"), "Bestsellers");
        //Mouse hover on “Sort By” and select “Rates”
        mouseHoverOnElement(By.xpath("//div[@class='sort-box']"));
        clickOnMouseHoverOnElement(By.linkText("Rates"));

    }

    @After
    public void tearDown() {
        closeBrowser();
    }


}
