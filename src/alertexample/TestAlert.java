package alertexample;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TestAlert extends Utility {
    String baseUrl = "https://courses.letskodeit.com/practice";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void alertExample() {

        //Click on Alert button
        clickOnElement(By.id("alertbtn"));
        switchToAlert();
        //Creating alert Object reference and switch to alert
        //driver.switchTo().alert();

        //Get text from alert
        String text = driver.switchTo().alert().getText();
        System.out.println(text);

        //Accept alert (press Ok button)
        driver.switchTo().alert().accept();

        //Send text to alert
        driver.switchTo().alert().sendKeys("Shubh");

    }

}
