package SeleniumSessions;

import collections.ArrayListDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class SeleniumSecondScript {

    String vehicleCheckboxXpath = "//input[@value='$$']";

    @Test
    public void test1() throws InterruptedException {
        ChromeDriver cd = new ChromeDriver();//firing up the browser
        cd.manage().window().maximize();//maximizing the window
        cd.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");//nav to web app

        Thread.sleep(18000);


        ArrayList<String> vehicles = new ArrayList<>();
        vehicles.add("Bike");
        vehicles.add("Car");
        vehicles.add("Boat");

        for (String vehicle : vehicles) {
            if(!cd.findElement(By.xpath(vehicleCheckboxXpath.replace("$$", vehicle))).isSelected()){
                cd.findElement(By.xpath(vehicleCheckboxXpath.replace("$$", vehicle))).click();
            }
        }

        //dropdowns

        String dropdownXpath = "//select[@id='Carlist']";

        Select dd = new Select(cd.findElement(By.xpath(dropdownXpath)));
        dd.selectByVisibleText("Audi");

        List<WebElement> options = dd.getOptions();
        for(WebElement ele : options){
            System.out.println(ele.getText());
        }




    }
}
