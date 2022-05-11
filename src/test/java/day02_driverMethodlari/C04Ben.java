package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04Ben {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();

        String sayfaKaynakKodlari = driver.getPageSource();
        String arananKelime = "aaa";

        if (sayfaKaynakKodlari.contains(arananKelime)) {
            System.out.println("test : PASSED");
        }else
            System.out.println("test : FAILED");

        driver.close();

    }
}
