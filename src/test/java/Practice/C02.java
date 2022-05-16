package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02 {
    public static void main(String[] args) throws InterruptedException {

//  ...Exercise2...
//  1-driver olusturalim
//  2-java class'imiza chromedriver.exe'yi tanitalim
//  3-driver'in tum ekrani kaplamasini saglayalim
//  4-driver'a sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini
//    söyleyelim. Eger oncesinde sayfa yuklenirse, beklemeyi bıraksin.

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//  5-"https://www.sahibinden.com" adresine gidelim
        driver.get("https://www.sahibinden.com");
        Thread.sleep(3000);

//  6-bu web adresinin sayfa basligini(title) ve adres(url)ini alalim
        String sahibindenTitile = driver.getTitle();
        System.out.println("sahibindenTitile = " + sahibindenTitile);
        String sahibindenUrl = driver.getCurrentUrl();
        System.out.println("sahibindenUrl = " + sahibindenUrl);
        
//  7-title ve url'nin "Oto" kelimesinin icerip icermedigini kontrol edelim
if (sahibindenTitile.contains("Oto") && sahibindenUrl.contains("Oto")){
    System.out.println("Oto yazisi vardir..");
} else
    System.out.println("Oto yazisi yoktur..");
            

//  8-Ardindan "https://www.gittigidiyor.com" adresine gidelim
        driver.get("https://www.gittigidiyor.com");

//  9-bu adresin basligini alalim ve "Sitesi" kelismesini icerip icermedigini
//    kontrol edelim
        System.out.println(driver.getTitle());
        boolean isTrue = driver.getTitle().contains("Oto");
        if (isTrue) {
            System.out.println("test PASSED");
        }else
            System.out.println("Test FAILED");

        //ternary ile.....
   //    String gittiTitle = driver.getTitle();
   //    System.out.println(gittiTitle.contains("Sitesi") ? "PASSED" : "FAILED");



//  10-Bi onceki web sayfamiza geri donelim
//  11-sayfayi yenileyelim
//  12-Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.close();

        //  13-En son adim olarak butun sayfalarimizi kapatmis olalim
         driver.quit();

    }

}