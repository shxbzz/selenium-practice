package junit;

import org.junit.*;

public class JUnitIntroduction {

    @BeforeClass
    public static void connectToDB() {
        System.out.println("DB connection");
    }

    @AfterClass
    public static void closeConnectionToDB() {
        System.out.println("Close connection");
    }

    @Before
    public void openBrowser() {
        System.out.println("Opening Browser");
    }

    @After
    public void closeBrowser() {
        System.out.println("Closing Browser");
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        System.out.println("Navigate to Login Page");
    }

    @Test
    public void test() {
        System.out.println("This is a test");
    }

}
