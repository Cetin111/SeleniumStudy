package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05Ben {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();

        System.out.println(driver.getWindowHandles()); //[CDwindow-C6ABE8AB9E7116380B0128F3246DB547]
        //sayfanin benzersiz hash kodunu verir
        driver.close();

    }
}
