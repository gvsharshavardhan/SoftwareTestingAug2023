package SeleniumSessions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Script7Demo {

    @Test
    public void test(){
        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://bugbug.io/blog/software-testing/best-selenium-practice-websites/#toolsqa-automation-practice-form");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println("*******************************************************************");
        System.out.println(driver.getPageSource());


        driver.quit();
    }
}
