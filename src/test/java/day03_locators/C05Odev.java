package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05Odev {
    /*
    1-google web sayfasina gidin. https://amazon.com/
    2-Search(ara) "city bike"
    3-Amazonda goruntulenen ilgili sonuclarin sayisini yazdirin
    4-"Shopping" e tiklayin
    5-Sonra karsiniza cikan ilk soucun resmine tiklayin
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1-google web sayfasina gidin. https://amazon.com/
        driver.get("https://www.amazon.com");  //amazon com a gider

        // 2-Search(ara) "city bike"
        WebElement aramaCubugu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaCubugu.sendKeys("city bike" + Keys.ENTER);

        // 3-Amazonda goruntulenen ilgili sonuclarin sayisini yazdirin
        //??

        //4-"Shopping" e tiklayin
        // ??

       // 5-Sonra karsiniza cikan ilk soucun resmine tiklayin




//<input class="gLFyf gsfi" jsaction="paste:puy29d;" maxlength="2048" name="q" type="text" aria-autocomplete="both"
// aria-haspopup="false" autocapitalize="off" autocomplete="off" autocorrect="off" autofocus="" role="combobox"
// spellcheck="false" title="Ara" value="" aria-label="Ara" data-ved="0ahUKEwiZkLag_Nn3AhXlSfEDHThPDm0Q39UDCAQ">




    }


}
