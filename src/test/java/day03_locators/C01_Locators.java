package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //Amazona gidip nutella aratalim
        driver.get("https://www.amazon.com");
        //finfElement(By ... locator) ==> istedigimiz web elementini bize dondurur,
        // bizde o web elementini kullanmak icin bir objeye aasign ederiz
        //WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox")); //id ile oldu
        WebElement aramaKutusu = driver.findElement(By.name("field-keywords")); //name ile oldu
        //herhangi bir web elemantine istedigimiz yaziyi yollamak istersek
        aramaKutusu.sendKeys("Telefon" + Keys.ENTER);

        //aldigimiz bir locator calismazsa alternatif locatorlar denemeliyiz, calismayabilir sorun yok

  driver.close();
    }
}
