package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Script9Demo {

    @Test
    public void Test(){
        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://letcode.in/");

        Actions actions = new Actions(driver);


        driver.findElement(By.xpath("//a[text()='Explore Workspace']")).click();

        System.out.println(driver.getTitle());

        driver.navigate().back();

        System.out.println(driver.getTitle());

        driver.navigate().forward();

        System.out.println(driver.getTitle());

        driver.navigate().refresh();

        driver.quit();
    }
}
