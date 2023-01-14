package selectexample;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.util.List;

public class TestDropDownList extends Utility {
    String baseUrl = "https://www.redbus.in/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void dropDownExampleWithList() {

        clickOnElement(By.xpath("//div[@id='manageHeaderdd']/div[1]"));

        List<WebElement> manageBookingList = driver.findElements(By.xpath("//div[@id='manageHeaderdd']//ul/li/span"));
        try {
            for (WebElement option : manageBookingList) {
                System.out.println(option.getText());
                if (option.getText().equals("Change Travel Date")) {
                    option.click();
                    break;
                }
            }

        } catch (StaleElementReferenceException e) {
            manageBookingList = driver.findElements(By.xpath("//div[@id='manageHeaderdd']//ul/li/span"));
        }

    }
}