package computer;

import homepage.Utility;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class TestSuite extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws ElementClickInterceptedException, InterruptedException {
        //click on computers
        clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]"));
        //click on Desktop
        clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h2[1]/a[1]"));
        //Select Sort By position "Prise : low to high"
        clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]"));
        /* Click on add to cart */
        clickOnElement(By.xpath("//button[@id='add-to-cart-button-1']"));
        assertVerifyText1(By.xpath("//h1[contains(text(),'Build your own computer')]"), "Build your own computer");
        //Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='product_attribute_1']"), "1");
        //Select "8GB [+$60.00]" using Select class.
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='product_attribute_2']"), "5");
        //Select HDD radio "400 GB [+$100.00]"
        clickOnElement(By.xpath("//input[@id='product_attribute_3_7']"));
        //Select OS radio "Vista Premium [+$60.00]"
        clickOnElement(By.xpath("//input[@id='product_attribute_4_9']"));
        //Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
        // clickOnElement(By.xpath("//input[@id='product_attribute_5_11']"));
        clickOnElement(By.xpath("//input[@id='product_attribute_5_12']"));
        Thread.sleep(2000);
        //Verify the price "$1,485.00"
        assertVerifyText1(By.cssSelector("#price-value-1"),"$1,475.00");
        //Click on "ADD TO CARD" Button.
        clickOnElement(By.xpath("//button[@id='add-to-cart-button-1']"));
        //Verify the Message "The product has been added to your shopping cart" on Top green Bar
        Thread.sleep(2000);
        assertVerifyText1(By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]"),"The product has been added to your shopping cart");
        clickOnElement(By.xpath("//button[@id='add-to-cart-button-1']"));
        Thread.sleep(1000);
        //close the bar clicking on the cross button.
        clickOnElement(By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]"));
        //Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        Actions actions = new Actions(driver);
        WebElement shoppingCard = driver.findElement(By.xpath("//span[contains(text(),'Shopping cart')]"));
        Thread.sleep(1000);
        WebElement goToCard = driver.findElement(By.xpath("//button[contains(text(),'Go to cart')]"));
        actions.moveToElement(shoppingCard).moveToElement(goToCard).click().build().perform();
        //Verify the message "Shopping cart"
        assertVerifyText1(By.xpath("//h1[contains(text(),'Shopping cart')]"),"Shopping cart");
        //Verify the Total"$2,950.00"
        assertVerifyText1(By.xpath("//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]"),"$2,950.00");
        //click on checkbox “I agree with the terms of service”
        clickOnElement(By.xpath("//input[@id='termsofservice']"));
        //Click on “CHECKOUT”
        clickOnElement(By.xpath("//button[@id='checkout']"));
        // Verify the Text “Welcome, Please Sign In!”
        assertVerifyText1(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"),"Welcome, Please Sign In!");
        // Click on “CHECKOUT AS GUEST”Tab
        clickOnElement(By.xpath("//button[contains(text(),'Checkout as Guest')]"));
        //Fill the all mandatory field
        sendTextToElement(By.id("BillingNewAddress_FirstName"), "Raju");
        sendTextToElement(By.id("BillingNewAddress_LastName"), "Patel");
        sendTextToElement(By.id("BillingNewAddress_Email"), "raju123@gmail.com");
        selectByVisibleTextFromDropDown(By.name("BillingNewAddress.CountryId"), "233");
        sendTextToElement(By.id("BillingNewAddress_City"), "London");
        sendTextToElement(By.id("BillingNewAddress_Address1"), "150,Elton park");
        sendTextToElement(By.id("BillingNewAddress_ZipPostalCode"), "WD456NW");
        sendTextToElement(By.id("BillingNewAddress_PhoneNumber"), "7772568945");
        clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]"));
        //contine
        clickOnElement(By.xpath("//input[@id='shippingoption_1']"));
        clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]"));
        //click on payment method////credit card
        clickOnElement(By.xpath("//input[@id='paymentmethod_1']"));
        clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]"));
        //fill all detail of master card
        sendTextToElement(By.xpath("//select[@id='CreditCardType']"), "Master card");
        sendTextToElement(By.id("CardholderName"), "Raju Patel");
        sendTextToElement(By.id("CardNumber"), "5425233430109903");
        sendTextToElement(By.id("ExpireMonth"), "08");
        sendTextToElement(By.id("ExpireYear"), "2026");
        sendTextToElement(By.id("CardCode"), "321");
        clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]"));
    }

    @After
    public void tearDown() {
        //closeBrowser();
    }


}
