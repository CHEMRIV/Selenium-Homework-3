package shopping;

import homepage.Utility;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ShoppingTest extends Utility {
    String baseUrl = "https://mobile.x-cart.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyThatUserShouldPlaceOrderSuccessfullyForVinylIdolzGhostbusters() throws InterruptedException {
        mouseHoverOnElement(By.xpath("//div[@class='collapse navbar-collapse']/ul/li[2]/span"));
        clickOnMouseHoverOnElement(By.xpath("//*[@id=\"header-area\"]/div[1]/div/div[4]/div/ul/li[2]/ul/li[2]/a/span"));
        Thread.sleep(2000);
        assertVerifyText1(By.id("page-title"), "Bestsellers");
        mouseHoverOnElement(By.xpath("//div[@class='sort-box']"));
        clickOnMouseHoverOnElement(By.linkText("Name A - Z"));
        Thread.sleep(2000);
        mouseHoverOnElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[8]"));
        Thread.sleep(2000);
        clickOnElement(By.xpath("//ul[@class = 'products-grid grid-list']/li[8]/div/div[2]/div[4]/div/button"));

        assertVerifyText1(By.xpath("//li[contains(text(),'Product has been added to your cart')]"), "Product has been added to your cart");
        clickOnElement(By.xpath("//div[@id='status-messages']/a"));

        clickOnElement(By.xpath("//div[@title='Your cart']"));
        Thread.sleep(2000);
        clickOnElement(By.linkText("View cart"));

        assertVerifyText1(By.id("page-title"), "Your shopping cart - 1 item");

        clickOnElement(By.xpath("//span[text()='Go to checkout']"));
        assertVerifyText1(By.xpath("//h3[contains(text(),'Log in to your account')]"), "Log in to your account");
        sendTextToElement(By.id("email"), "abc@gmail.com");
        clickOnElement(By.xpath("//span[contains(text(),'Continue')]"));
        assertVerifyText1(By.xpath("//*[@id=\"content\"]/div/div/div/div/div/h1"), "Secure Checkout");
        sendTextToElement(By.id("shippingaddress-firstname"), "abc");
        sendTextToElement(By.id("shippingaddress-lastname"), "xyz");
        sendTextToElement(By.id("shippingaddress-street"), "abc street");
        sendTextToElement(By.id("shippingaddress-custom-state"), "xyz");
        Thread.sleep(2000);
        clickOnElement(By.id("method128"));
        clickOnElement(By.id("pmethod6"));

        Thread.sleep(2000);
        clickOnElement(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/button[1]"));

        assertVerifyText1(By.xpath("//h1[@id='page-title']"), "Thank you for your order");
    }


    @Test
    public void verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException {
        mouseHoverOnElement(By.xpath("//div[@class='collapse navbar-collapse']/ul/li[2]/span"));
        clickOnMouseHoverOnElement(By.xpath("//*[@id=\"header-area\"]/div[1]/div/div[4]/div/ul/li[2]/ul/li[2]/a/span"));

        assertVerifyText1(By.id("page-title"), "Bestsellers");
        mouseHoverOnElement(By.xpath("//div[@class='sort-box']"));
        clickOnMouseHoverOnElement(By.linkText("Name A - Z"));

        mouseHoverOnElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[8]"));
        Thread.sleep(2000);
        clickOnElement(By.xpath("//ul[@class = 'products-grid grid-list']/li[8]/div/div[2]/div[4]/div/button"));

        assertVerifyText1(By.xpath("//li[contains(text(),'Product has been added to your cart')]"), "Product has been added to your cart");
        clickOnElement(By.xpath("//div[@id='status-messages']/a"));

        clickOnElement(By.xpath("//div[@title='Your cart']"));
        Thread.sleep(2000);
        clickOnElement(By.linkText("View cart"));

        assertVerifyText1(By.id("page-title"), "Your shopping cart - 1 item");

        clickOnElement(By.xpath("//a[contains(text(),'Empty your cart')]"));

        acceptAlert();

        assertVerifyText1(By.xpath("//li[contains(text(),'Item(s) deleted from your cart')]"), "Item(s) deleted from your cart");
        assertVerifyText1(By.xpath("//h1[contains(text(),'Your cart is empty')]"), "Your cart is empty");
    }
}