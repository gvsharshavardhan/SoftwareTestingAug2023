package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumScript {
    static WebDriver browser;

    public static void main(String[] args) throws InterruptedException {

        String browserName = "chrome";

        //1. open the browser
        if (browserName.equals("chrome")) {
            browser = new ChromeDriver();
        } else if (browserName.equals("firefox")) {
            browser = new FirefoxDriver();
        } else {
            browser = new EdgeDriver();
        }


        browser.manage().window().maximize();

        //2. navigate to a web application
        browser.get("https://demoqa.com/automation-practice-form");

        Thread.sleep(2000);

        /**
         * id
         * class
         * tag
         * linktext
         * partial link text
         * name
         *
         * xpath
         * css
         */

        //input fields
        browser.findElement(By.id("firstName")).sendKeys("selenium");
        browser.findElement(By.id("lastName")).sendKeys("sessions");

        browser.findElement(By.id("userEmail")).sendKeys("random@test.com");

        browser.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[3]/div[2]/div[2]/label")).click();
        browser.findElement(By.id("userNumber")).sendKeys("6579982345");
        browser.findElement(By.id("dateOfBirthInput")).click();
        browser.findElement(By.xpath("//div[@aria-label='Choose Saturday, October 7th, 2023']")).click();

        /**
         * relative xpath
         *
         * //tag[@attr='value']
         *
         */

        browser.findElement(By.id("subjectsInput")).sendKeys("programming, coding, algorithms");

        browser.findElement(By.id("hobbies-checkbox-1")).click();
        browser.findElement(By.id("hobbies-checkbox-3")).click();

        browser.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\Harsha\\Dropbox\\My PC (DESKTOP-JOKB8D4)\\Desktop\\2layersInSoftware.png");

        browser.findElement(By.id("currentAddress")).sendKeys("brampton, canada");







    }

}
