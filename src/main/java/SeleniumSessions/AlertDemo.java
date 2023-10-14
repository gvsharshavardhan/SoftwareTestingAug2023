package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.NoSuchElementException;

public class AlertDemo {
    ChromeDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoqa.com/alerts");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void test1() {

        driver.findElement(By.xpath("//button[@id='alertButton']")).click();
        Alert a = driver.switchTo().alert();
        System.out.println(a.getText());
        a.accept();


    }

    @Test
    public void test2() throws InterruptedException{

        LocalDateTime currentDateTime1 = LocalDateTime.now();
        System.out.println(currentDateTime1);

        driver.findElement(By.id("timerAlertButton")).click();

        //explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());

//
//        Wait<WebDriver> wait2 = new FluentWait<WebDriver>(driver)
//                .withTimeout(Duration.ofSeconds(30))
//                .pollingEvery(Duration.ofSeconds(5))
//                .ignoring(NoSuchElementException.class);
//
//        WebElement element = wait2.until(new Function<WebDriver, WebElement>() {
//            public WebElement apply(WebDriver driver) {
//                return driver.findElement(By.id("some-id"));
//            }
//        });



        Alert a = driver.switchTo().alert();
        LocalDateTime currentDateTime2 = LocalDateTime.now();
        System.out.println(currentDateTime2);
        a.accept();

    }
}
