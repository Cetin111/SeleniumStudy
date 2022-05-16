package day04_xpath_cssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05YotubdanVideoAc {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.youtube.com/"); //youtuba git
        WebElement aramaCubuguElement = driver.findElement(By.xpath("//input[@id='search']")); //arama kutusu locater

        aramaCubuguElement.sendKeys("Sezen Aksu Kaybolan Yıllar"); //arama kutusuna gonderildi

        WebElement araTusuElement = driver.findElement(By.xpath("//button[@id='search-icon-legacy']")); //ara butonu lcater
        araTusuElement.click();  //ara butonuna tikla

    //  WebElement sarkiLinkiElement = driver.findElement(By.xpath("//yt-formatted-string[@aria-label='Sezen Aksu - Kaybolan Yıllar (Official Audio) Sezen Aksu tarafından 5 yıl önce 3 dakika 8 saniye 8.623.040 görüntüleme']"));
    //  sarkiLinkiElement.click();


//




    }
}
