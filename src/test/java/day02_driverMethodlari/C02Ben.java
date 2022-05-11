package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02Ben {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();

        System.out.println("actuel title : " + driver.getTitle()); //actuel title : Amazon.com. Spend less. Smile more.
        System.out.println("actuel url : " +driver.getCurrentUrl()); //actuel url : https://www.amazon.com/

        Thread.sleep(3000);
        driver.close();
    }
}
