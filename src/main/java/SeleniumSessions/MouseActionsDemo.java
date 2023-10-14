package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseActionsDemo {

    @Test
    public void test1(){
        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/drag_and_drop");

        Actions actions = new Actions(driver);

        WebElement  source = driver.findElement(By.id("column-a"));
        WebElement  target = driver.findElement(By.id("column-b"));

        actions.dragAndDrop(source,target).perform();
    }

    @Test
    public void test2() throws InterruptedException{
        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/");

        Thread.sleep(2000);

        Actions actions = new Actions(driver);
        actions.scrollToElement(driver.findElement(By.xpath("//a[text()='Typos']"))).perform();

    }



}
