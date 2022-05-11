package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06Ben {
    public static void main(String[] args) throws InterruptedException {
        //once amazon.com a git
        // facebook a git
        // tekrar amazona don
        // tekrar facebook a git
        //sayfayi refresh et
        //kapat
        //aralarda 3 er saniye bekleyerek yap.

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //once amazon.com a git
        driver.navigate().to("https://www.amazon.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        // facebook a git
        driver.navigate().to("https://www.facebook.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        // tekrar amazona don, geri donduk
        driver.navigate().back();
        Thread.sleep(3000);

        // tekrar facebook a git, ileri gittik
        driver.navigate().forward();
        Thread.sleep(3000);

        //sayfayi refresh et
        driver.navigate().refresh();
        Thread.sleep(3000);

        driver.close();

    }
}
