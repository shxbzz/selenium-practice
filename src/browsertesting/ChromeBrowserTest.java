package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Launch the URL
        driver.get(baseUrl);

        //Maximise Window
        driver.manage().window().maximize();

        //Give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);

        //Get current URL
        System.out.println("Current URL is: " + driver.getCurrentUrl());

        //Get Page Source
        System.out.println("Page source: " + driver.getPageSource());

        //Navigate to Login URL
        // String loginUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        // driver.navigate().to(loginUrl);


        //Navigate to Login page by clicking
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        //Find and enter login details
        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("abc@gmail.com");

        WebElement password = driver.findElement(By.name("Password"));
        password.sendKeys("password");


        //Close the browser
        //driver.quit();
    }

}
