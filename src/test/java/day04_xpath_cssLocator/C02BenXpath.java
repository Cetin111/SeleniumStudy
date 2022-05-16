package day04_xpath_cssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02BenXpath {
     /*
 1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
 2- Add Element butonuna basin
 3- Delete butonu’nun gorunur oldugunu test edin
 4- Delete tusuna basin
 5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
 */

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        // 2- Add Element butonuna basin
        WebElement addButonuElement = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        addButonuElement.click();

        // 3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonuElelemnti = driver.findElement(By.xpath("//button[@class='added-manually']"));
        if (deleteButonuElelemnti.isDisplayed()) {
            System.out.println("Delete butonu elementi testi : PASSED");
        } else
            System.out.println("Delete butonu elementi testi : FAILED");


        // 4- Delete tusuna basin
        deleteButonuElelemnti.click();

        // 5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveElement = driver.findElement(By.xpath("//h3['Add/Remove Elements']"));
        if (addRemoveElement.isDisplayed()) {
            System.out.println("Add/Remove Elements butonu elementi testi : PASSED");
        } else
            System.out.println("Add/Remove Elements butonu elementi testi : FAILED");

        driver.close();

    }

}
