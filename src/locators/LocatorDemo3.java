package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LocatorDemo3 extends BaseTest {

    String baseUrl = "https://courses.letskodeit.com/practice";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void locatorDemoTest3() {
        //Using ID
        driver.findElement(By.cssSelector("#displayed-text")).sendKeys("CSS");

        //Using Tag and ID together
        driver.findElement(By.cssSelector("input#displayed-text")).sendKeys("CSS");

        //Using class
        driver.findElement(By.cssSelector(".inputs.displayed-class")).sendKeys("CSS");

        //Using tag and class
        driver.findElement(By.cssSelector("input.inputs.displayed-class")).sendKeys("CSS");
    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
