package day02_driverMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07Ben {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.amazon.com");
        System.out.println("sayfa olculeri = " + driver.manage().window().getSize()); //sayfa olculeri = (1050, 708)
        System.out.println("sayfa pozisyonu(konumu) = " +driver.manage().window().getPosition()); //sayfa pozisyonu(konumu) = (10, 10)
        Thread.sleep(2000);

        //sayfa olculerini ve konumunu degistirelim.
        driver.manage().window().setSize(new Dimension(600,400));
        Thread.sleep(2000);
        driver.manage().window().setPosition(new Point(70,70));
        Thread.sleep(2000);

        driver.close();




    }

}
