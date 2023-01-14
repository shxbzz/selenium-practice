package switchwindows;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

import java.util.Set;

public class TestSwitchWindow extends Utility {
    String baseUrl = "https://courses.letskodeit.com/practice";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void switchWindowExample() {
        //Get the handle of window
        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent window : " + parentWindow);

        clickOnElement(By.id("openwindow"));

        Set<String> handles = driver.getWindowHandles();
        System.out.println(handles);

        for(String handle : handles){
            if (!handle.equals(parentWindow)){
                driver.switchTo().window(handle);
                clickOnElement(By.xpath("//a[contains(text(),'Sign In')]"));
                driver.close();
                break;
            }
        }
        //Switch back to the parent
        driver.switchTo().window(parentWindow);
        sendTextToElement(By.id("name"),"Test Successful");
    }
}
