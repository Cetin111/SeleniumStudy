package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09Ben {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazonnnnjghj.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));  //yazilan web sayfasinin acilmasi icin
        //beklenen sure. yani 15 saniye icinde site acilmazsa bize hata olarak uyari vermesi gereken sure.
        //15 saniyede acilmazsa alt satira gecmez orda kalir...

        driver.close();  //hata verince sayfa kapanmayacak
    }
}
