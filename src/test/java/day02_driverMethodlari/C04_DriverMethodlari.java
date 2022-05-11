package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverMethodlari {
    public static void main(String[] args) {
        //amazon sitesine gidip kaynak kodlarinda bir kelime aratalim. "Gateway" yazdigini test edelim
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); //acilan web sayfasini tam ekran yapar

        driver.get("https://www.amazon.com"); //bu sayfaya gider
        String sayfaKaynakKodlari =  driver.getPageSource(); //getPageSource() sayfanin kaynak kodlarina gider
        String arananKelime = "Gateway";
        if (sayfaKaynakKodlari.contains(arananKelime)){
            System.out.println("kaynak kodu testi : PASSED");

        }else {
            System.out.println("Kaynak kodlarinda " + arananKelime + " yok, test FAILED");
        }

        driver.close();

    }
}
