package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FramesDemo {


    @Test
    public void frameTest(){
        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/nested_frames");

        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
        driver.switchTo().frame(driver.findElement(By.name("frame-left")));


        System.out.println(driver.findElement(By.xpath("//body[contains(text(),'LEFT')]")).getText());

        driver.switchTo().parentFrame();
        driver.switchTo().frame(driver.findElement(By.name("frame-middle")));


        System.out.println(driver.findElement(By.xpath("//div[contains(text(),'MIDDLE')]")).getText());


        driver.switchTo().parentFrame();
        driver.switchTo().frame(driver.findElement(By.name("frame-right")));

        System.out.println(driver.findElement(By.xpath("//body[contains(text(),'RIGHT')]")).getText());


        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.name("frame-bottom")));
        System.out.println(driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]")).getText());
    }
}
