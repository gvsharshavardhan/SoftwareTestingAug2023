package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SwagLabsDemo {

    @Test(dataProvider = "dataProviderForLogin")
    public void loginTest(String un, String pw) throws InterruptedException {
        ChromeDriver browser = new ChromeDriver();
        browser.get("https://www.saucedemo.com/");

        browser.findElement(By.id("user-name")).sendKeys(un);
        browser.findElement(By.id("password")).sendKeys(pw);

        browser.findElement(By.id("login-button")).click();

        Thread.sleep(2000);

        if(pw.equals("secret_sauce")) {
            String actualtext = browser.findElement(By.className("title")).getText();
            String expectedText = "Products";

            Assert.assertEquals(actualtext, expectedText, "Title of the page is not as expected!!");
        }else{
            String actualErrorMessage = browser.findElement(By.tagName("h3")).getText();
            String expectedErrorMessage = "Username and password is not equal";

            Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage));
        }

        browser.quit();

        /**
         * 1. AAA
         * Arrange test data, Act the flow, Assert the data(validations)
         */

    }


    @DataProvider
    public Object[][] dataProviderForLogin() {
        Object[][] data = new Object[2][2];

        data[0][0] = "standard_user";
        data[0][1] = "secret_sauce";

        data[1][0] = "standard_user";
        data[1][1] = "xyz";

        return data;
    }

}
