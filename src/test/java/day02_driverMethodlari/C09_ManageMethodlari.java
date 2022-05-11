package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_ManageMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.com");
        driver.close(); //acilan sayfayi kapatir
        //driver.quit(); // test esnasinda acilan birden cok sayfa varsa hepsini kapatir

        /*
        ilerde wait konusunu daha genis olarak ele alacagiz.
        simdilik sunu bil : bir sayfa acilirken ilk basta sayfanin icerisinde bulunan elementlere gore
        bir yuklenme suresine ihtiyac vardir.
        veya bir web elementinin kullanilabilmesi icin zamana ihtiyac olabilir..
        implicitlyWait bize sayfanin yuklenmesi ve sayfadaki elementlere ulasim icin beklenecek
        max sureyi belirleme olanagi verir
        url yanlis yazailmis sa mesela 15 saniye bekleyip istedgmiz siteye gidemezsek hata almis olucaz..
        ama site 3 saniyede yuklenirse yuklenir yuklenmez is biter
         */


    }
}
