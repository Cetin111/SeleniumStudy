package day01_selenyumProje;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {

    public static void main(String[] args) throws InterruptedException {
        /*en ilkel haliyle bir otomasyon yapmak icin
        Class imiza otomasyon icin gerekli olan webdriver in yerini gostermemiz gerekir
        bunu icin java kutuphanesinden System.setProperty() methodu kullanilir. (Ilk ayarlari yapmak icin)
       method iki parametre istiyor,
       ilki kullanacagimiz driver: webdriver.chrome.driver
       ikincisi ise bu driverin fiziki yolu:
       */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
          //sondaki .exe mac lerde olmaz.
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.amazon.com");
        Thread.sleep(5000);
        driver.close();




    }
}

