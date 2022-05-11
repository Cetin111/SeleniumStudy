package day02_driverMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_ManageMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        System.out.println("pencere olculeri : " +driver.manage().window().getSize()); //pencere olculeri : (1050, 708)
        System.out.println("pencere konumu : " +driver.manage().window().getPosition()); //pencere konumu : (10, 10)
        Thread.sleep(3000);

        //pencere boyut ve konumu degistirelim
        driver.manage().window().setPosition(new Point(15,15));
        driver.manage().window().setSize(new Dimension(900,600));

        System.out.println("yeni pencere olculeri : " +driver.manage().window().getSize()); //yeni pencere olculeri : (900, 600)
        System.out.println("yeni pencere konumu : " +driver.manage().window().getPosition()); //yeni pencere konumu : (15, 15)

        driver.close();


    }
}