package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C08Ben {
    public static void main(String[] args) throws InterruptedException {
        /*
        amazon.com a git
        sayfayi tam ekran yap (maximize)
        sayfa olcuerini al
        sonra sayfayi fulscreen yap
        olculerini al
        kapat
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        driver.manage().window().maximize();
        System.out.println("Maximize boyut: " +driver.manage().window().getSize()); //Maximize: (1382, 744)
        System.out.println("Maximize konum: " +driver.manage().window().getPosition());  //Maximize konum: (-8, -8)
        Thread.sleep(2000);

        driver.manage().window().fullscreen();
        System.out.println("Fullscreen boyut: " +driver.manage().window().getSize()); // Fullscreen : (1366, 768)
                                            //fullscreen deki olculer ekran cozunurlugudur mu acaba?
        System.out.println("Fullscreen konum: " +driver.manage().window().getPosition()); //Fullscreen konum: (0, 0)
        Thread.sleep(2000);

        driver.close();


    }
}
