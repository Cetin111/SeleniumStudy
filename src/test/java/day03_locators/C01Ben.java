package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01Ben {
    //Amazona gidip nutella aratalim
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");   //amazon.com a git
        WebElement aramaKutusu =  driver.findElement(By.id("twotabsearchtextbox")); //arama kutusunu assign ettik
        aramaKutusu.sendKeys("nutella" + Keys.ENTER); //arama kutusuna nutella yadirip entera bastik
        Thread.sleep(2000); // 2sn bekledik
        driver.close(); //kapattik






    }
}
