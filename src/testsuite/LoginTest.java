package testsuite;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    public void clickOnElement(By by){
        WebElement loginLink = driver.findElement(by);
        loginLink.click();
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        // Find log in link and click
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        clickOnElement(By.linkText("Log in"));




        //This is from requirement
        String expectedMessage = "Welcome, Please Sign In!";

        //Find the welcome text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String actualMessage = actualTextMessageElement.getText();

        //Validate actual and expected message
        Assert.assertEquals("Did not navigate to login page",expectedMessage, actualMessage);
    }

    @After
    public void testDown() {
        closeBrowser();
    }

}
