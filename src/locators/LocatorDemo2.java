package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LocatorDemo2 extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void locatorDemoTest2() {
        //Class name locator -- To find multiple elements
        List<WebElement> sliderList = driver.findElements(By.className("nivo-imageLink"));
        int size = sliderList.size();
        System.out.println("Total slide is " + size);

        //Tag name locator -- To find multiple elements
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Number of links is " + links.size());
    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
