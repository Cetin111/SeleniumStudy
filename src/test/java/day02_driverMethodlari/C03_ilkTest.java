package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ilkTest {
    public static void main(String[] args) {
        /*  1- https://www.amazon.com url ine gidin,
            2- Basligin Amazon kelimesi icerdigini test edin
            3- Url in https://www.amazon.com a esit oldugunu test edin
            4- Sayfayi kapatin
     */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

       //  1- https://www.amazon.com url ine gidin,
        driver.get("https://www.amazon.com");


        // 2- Basligin Amazon kelimesi icerdigini test edin
        String actuelTitle = driver.getTitle();
        String arananKelime="Amazon";
        if (actuelTitle.contains(arananKelime)){
            System.out.println("Title testi PASSED");
        } else {
            System.out.println("Title " + arananKelime + "yi icermiyor, title testi FAILED");
        }


      //  3- Url in https://www.amazon.com a esit oldugunu test edin
        String actuelUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com";
        if (actuelTitle.equals(expectedUrl)){
            System.out.println("Url testi PASSED");

        }else {
            System.out.println("actual Url : " + actuelUrl+ " beklenen url den farkli, test FAILED");
        }

      //  4- Sayfayi kapatin
        driver.close();

    }
}
