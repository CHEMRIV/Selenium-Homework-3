package utility;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility extends BaseTest {


    //1) This method will click on element

    public void clickOnElement(By by) {
        WebElement element = driver.findElement(by);
        element.click();
    }

    //2)This method will get text fro elements

    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();}


     //3This method will send text on element

    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    /**
     * Housemoving method
     */

    public void mouseHoverOnElement (By by){
        Actions actions = new Actions(driver);
        WebElement element =driver.findElement(by);
        actions.moveToElement(element).build().perform();
    }
    public void clickOnMouseHoverOnElement (By by){
        Actions actions = new Actions(driver);
        WebElement element =driver.findElement(by);
        actions.moveToElement(element).click().build().perform();
    }
    /**
     * This method will select the option by visible text
     */
    public void selectByVisibleTextFromDropDown(By by, String text) {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByValue(text);}
    /**
     * Assert method
     */
    public void assertVerifyText1(By by, String expectedtext) {
        String actualText = getTextFromElement(by);
        String expectedText = expectedtext;
        Assert.assertEquals("Error>Test failed  : ", expectedText, actualText);

    }

    public void assertVerifyText2(By by, String expectedtext) {
        String actualText = getTextFromElement(by);
        String expectedText = expectedtext;
        String actualTextFinal = actualText.substring(0, 25);
        Assert.assertEquals("Error>Test failed  : ", expectedText, actualTextFinal);}

//*****************************Alert method*************************************************************//

    /**
     * This method will switch alert
     */
    public void switchToAlert() {
        driver.switchTo().alert();
    }

    /**
     * This method will acept alert
     */
    public void acceptAlert(){
        driver.switchTo().alert().accept();}


    }








