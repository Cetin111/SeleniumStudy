package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_getWindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        System.out.println(driver.getWindowHandle()); //CDwindow-6CD90100EE830B2962DA1BE78CD1B718
                // benzersiz olarak acilan windowa ait hashcode unu verir.
        // ilerde pencereler arasi gecis icin kuallancaz.

    }
}
