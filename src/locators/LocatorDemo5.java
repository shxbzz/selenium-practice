package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LocatorDemo5 extends BaseTest {

    String baseUrl = "https://money.rediff.com/gainers/bse/daily/groupa";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void locatorDemoTest5() {

        //Self --- Select the current node
        String text = driver.findElement(By.xpath("//a[contains(text(),'IDBI Bank')]/self::a")).getText();
        System.out.println(text); //IDBI Bank

        //Parent --- Select the parent of the current node (always one)
        String texta = driver.findElement(By.xpath("//a[contains(text(),'IDBI Bank')]/parent::td")).getText();
        System.out.println(texta);

        //Child --- Select the children of the current node (one or many)
        List<WebElement> children = driver.findElements(By.xpath("//a[contains(text(),'IDBI Bank')]/ancestor::tr/child::td"));
        System.out.println("Number of child elements : "+children.size());

        //Ancestor --- Select all ancestor (parent, grandparent etc...)
        String textc = driver.findElement(By.xpath("//a[contains(text(),'IDBI Bank')]/ancestor::tr")).getText();
        System.out.println(textc);

        //Descendant --- Select all descendants (children, grandchildren etc...)
        List<WebElement> descendant = driver.findElements(By.xpath("//a[contains(text(),'IDBI Bank')]/ancestor::tr/descendant::*"));
        System.out.println("Number of descendants : " + descendant.size());

        //Following --- Select everything in document after closing tag of the current node
        List<WebElement> following = driver.findElements(By.xpath("//a[contains(text(),'IDBI Bank')]/ancestor::tr/following::tr"));
        System.out.println("Number of following : " + following.size());

        //Following-Sibling --- Select all siblings after the current node
        List<WebElement> followingSibling = driver.findElements(By.xpath("//a[contains(text(),'IDBI Bank')]/ancestor::tr/following-sibling::tr"));
        System.out.println("Number of following-sibling : " + followingSibling.size());

        //Preceding --- Select all nodes that appear before the current node in the document
        List<WebElement> preceding = driver.findElements(By.xpath("//a[contains(text(),'IDBI Bank')]/ancestor::tr/preceding::tr"));
        System.out.println("Number of preceding : " + preceding.size());

        //Preceding-Sibling --- Select all siblings before the current node
        List<WebElement> precedingSibling = driver.findElements(By.xpath("//a[contains(text(),'IDBI Bank')]/ancestor::tr/preceding-sibling::tr"));
        System.out.println("Number of preceding-sibling : " + precedingSibling.size());
    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
