package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TablesDemo {

    @Test
    public void webTablesTest() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/webtables");

        Person p1 = new Person("Manvi", "Gupta", "manvi@test.com", "30", "4000", "IT department");
        Person p2 = new Person("Ramya", "Polepalli", "ramya@test.com", "16", "5000", "Railway department");
        Person p3 = new Person("Harsha", "GVS", "Harsha@test.com", "55", "5500", "Testing department");

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);

        for (Person p : persons) {
            driver.findElement(By.xpath("//button[text()='Add']")).click();
            driver.findElement(By.id("firstName")).sendKeys(p.getFirstName());
            driver.findElement(By.id("lastName")).sendKeys(p.getLastName());
            driver.findElement(By.id("userEmail")).sendKeys(p.getEmail());
            driver.findElement(By.id("age")).sendKeys(p.getAge());
            driver.findElement(By.id("salary")).sendKeys(p.getSalary());
            driver.findElement(By.id("department")).sendKeys(p.getDepartment());
            driver.findElement(By.id("submit")).click();
            Thread.sleep(1000);
        }

        List<WebElement> salaryElements = driver.findElements(By.xpath("//div[@class='rt-tr-group']/div/div[5]"));
        int total = 0;
        for (WebElement ele : salaryElements) {
            if(ele.getText().trim().length()!=0) {
                total = total + Integer.parseInt(ele.getText());
            }
        }
        System.out.println("total salary from the table: " + total);
    }


}
