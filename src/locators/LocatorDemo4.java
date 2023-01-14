package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LocatorDemo4 extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void locatorDemoTest4() {
        //Relative X-Path
        driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Mobile");

        //X-Path with or
        driver.findElement(By.xpath("//input[@id='small-searchterms' or @name='q']")).sendKeys("Mobile");

        //X-Path with and
        driver.findElement(By.xpath("//input[@id='small-searchterms' and @placeholder='Search store']")).sendKeys("Mobile");

        //X-Path with contains
        driver.findElement(By.xpath("//input [contains (@id, 'search')]")).sendKeys("Mobile");

        //X-Path with starts-with
        driver.findElement(By.xpath("//input [starts-with(@placeholder, 'Search')]")).sendKeys("Mobile");

        //X_Path with text
        driver.findElement(By.xpath("//a[text() = 'Log in']")).click();

        //Chained X-Path
        //div[@class='header-menu'] /ul[1]/li[1]/a
        //or
        //ul[@class='top-menu notmobile']//a[text()='Computers ']


    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
