package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03Ben {
       /*  1- https://www.amazon.com url ine gidin,
            2- Basligin Amazon kelimesi icerdigini test edin
            3- Url in https://www.amazon.com a esit oldugunu test edin
            4- Sayfayi kapatin

         */
       public static void main(String[] args) {


           System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
           WebDriver driver = new ChromeDriver();

         //  1- https://www.amazon.com url ine gidin,
           driver.get("https://www.amazon.com");

         //  2- Basligin Amazon kelimesi icerdigini test edin
           String actuelTitle = driver.getTitle();
           String arananKelime = "Amazon";

           if (actuelTitle.contains(arananKelime)){
               System.out.println("baslik : " + arananKelime + " kelimesini iceriyor, Test:PASSED");
           } else {
               System.out.println("baslik : " + arananKelime + " kelimesini icermiyor, Test:FAILED");
           }

         //  3- Url in https://www.amazon.com a esit oldugunu test edin
           String actuelUrl = driver.getCurrentUrl();
           String arananUrl = "https://www.amazon.com";

           if (actuelTitle.contains(arananUrl)){
               System.out.println("Url testi : PASSED");
           } else {
               System.out.println("Actuel url :" + actuelUrl + " beklenen url den farkli, test:FAILED ");
           }

           //   4- Sayfayi kapatin

           driver.close();






       }

}
