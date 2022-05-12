package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.stylesheets.LinkStyle;

import java.time.Duration;
import java.util.List;

public class C02Ben {
    //amazon sayfasinda kac tane link bulundugunu yazdiralim
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();  //pencereyi tam ekran yap
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //sitenin acilmasini en fazla 15 saniye bekle

        driver.get("https://www.amazon.com");  //amazona git
        List<WebElement> linkSayisiListesi = driver.findElements(By.tagName("a")); //tagi a olanlari listele
        System.out.println("link sayisi : " + linkSayisiListesi.size()); //link sayisi : 315  //link sayisini yazdirdik
        driver.close();  //kapat
    }
}
