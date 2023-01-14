package switchwindows;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TestFrame extends Utility {
    String baseUrl = "https://courses.letskodeit.com/practice";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void switchIFrameExample() throws InterruptedException {

        //Switch to frame
        driver.switchTo().frame("courses-iframe");
        Thread.sleep(5000);
        //Find the element inside the frame and send text
        sendTextToElement(By.xpath("//input[@id='search']"), "Prime Testing");

        //Switch to default content
        driver.switchTo().defaultContent();

        //Send text to search box
        sendTextToElement(By.id("name"),"Shubh");

    }
}
