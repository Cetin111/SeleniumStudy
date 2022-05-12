package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_findElements {
    public static void main(String[] args) {
        //amazon sayfasinda kac tane link bulundugunu yazdiralim
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");  //amazona git
        driver.manage().window().maximize();  //pencereyi tam ekran yap
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //sitenin acilmasini en fazla 15 saniye bekle

        List<WebElement> linkListesi = driver.findElements(By.tagName("a")); //a tagi link tagiydi, amazonda kac tane link var
        System.out.println("sayfadaki link sayisi : " + linkListesi.size()); //sayfadaki link sayisi : 317

        driver.close(); // kapat

    }
}
