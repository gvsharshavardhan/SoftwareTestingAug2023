package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class FirstDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;

        Scanner sc = new Scanner(System.in);
        System.out.println("PLease enter the brwser name:: ");
        String browser = sc.nextLine();

        if (browser.equals("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equals("firefox")) {
            driver = new FirefoxDriver();
        } else {
            driver = new EdgeDriver();
        }

        driver.get("https://www.saucedemo.com/");

        Thread.sleep(1000);

        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        WebElement loginbtn = driver.findElement(By.id("login-button"));
        loginbtn.click();


        Thread.sleep(2000);

        driver.quit();


    }
}
