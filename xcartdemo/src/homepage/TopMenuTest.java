package homepage;

import com.google.common.base.Verify;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends Utility {
    String baseUrl = "https://mobile.x-cart.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully() {
        //Click on the “Shipping” link
        clickOnElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[3]/a[1]/span[1]"));
        //Verify the text “Shipping”
        assertVerifyText1(By.xpath("//h1[@id='page-title']"), "Shipping");
    }

    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully() {
        //Click on the “New!” link
        clickOnElement(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[4]/a[1]"));
        //Verify the text “New arrivals”
        assertVerifyText1(By.xpath("//h1[@id='page-title']"), "New arrivals");
    }

    @Test
    public void verifyUserShouldNavigateToComingSoonPageSuccessfully() {
        //Click on the “Coming soon” link
        clickOnElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[5]/a[1]/span[1]"));
        //Verify the text “Coming soon”
        assertVerifyText1(By.xpath("//h1[@id='page-title']"), "Coming soon");
    }

    @Test
    public void verifyUserShouldNavigateToContactUsPageSuccessfully() {
        //Click on the “Contact us” link
        clickOnElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[6]/a[1]/span[1]"));
        //Verify the text “Contact us”
        assertVerifyText1(By.xpath("//h1[@id='page-title']"), "Contact us");
    }


}
