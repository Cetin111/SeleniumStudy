package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03Ben {
    /* Main method oluşturun ve aşağıdaki görevi tamamlayın.
    a. http://a.testaddressbook.com adresine gidiniz.
    b. Sign in butonuna basin
    c. email textbox,password textbox, and signin button elementlerini locate ediniz..
    d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
    i. Username : testtechproed@gmail.com
    ii. Password : Test1234!
    e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
    f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
            3. Sayfada kac tane link oldugunu bulun. */

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //    a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com"); //sayfaya git

        //    b. Sign in butonuna basin
       WebElement signInLinki = driver.findElement(By.id("sign-in")); //sign in linkini locate ettik
       signInLinki.click(); //linke tikladik

        //    c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement emailKutusu = driver.findElement(By.id("session_email")); //email kutusunu locate etik
        WebElement passwordKutusu = driver.findElement(By.name("session[password]")); //password kutusunu locate ettik
        WebElement signInButonu = driver.findElement(By.name("commit")); //sign in butonunu locate ettik


        //    d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //                  i. Username : testtechproed@gmail.com
        //                   ii. Password : Test1234!

        emailKutusu.sendKeys("testtechproed@gmail.com"); //kullanici adini girdik
        passwordKutusu.sendKeys("Test1234!"); //sifre girdik
        signInButonu.click(); //sign in e tikladik

        //    e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement aktuelKullaniciAdiElementi = driver.findElement(By.className("navbar-text")); //kullanici adi locater edildi
        String expectedUserName = "testtechproed@gmail.com"; //beklenen sonucu Stringe assing ettik

               //bir web elemntin uzerinde ne yazdigini gormek istersek WebElementIsmi.getText() kullaniriz
        if (expectedUserName.equals(aktuelKullaniciAdiElementi.getText())){
            System.out.println("Kullanici ismi Testi : PASSED");  //Kullanici ismi Testi : PASSED
        } else {                //beklenen sonuc(expected) ile su bulunansonuc (actuel) aynimi degilmi diye test ettik
            System.out.println("kullanici ismi Testi : FAILED");
        }

        //    f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement adressesLinkiElementi = driver.findElement(By.linkText("Addresses"));
        WebElement singOutLinkiElementi = driver.findElement(By.linkText("Sign out"));

        String adressedText = "Addresses";
        String signOutText = "Sign Out";

        if (adressesLinkiElementi.isDisplayed()){
            System.out.println("Adresses Testi : PASSED");
        }else
            System.out.println("Adresses Testi : FAILED");

        if (singOutLinkiElementi.isDisplayed()){
            System.out.println("SignOut Testi : PASSED");
        }else
            System.out.println("SignOut Testi : FAILED");


        //    e. 3.Sayfada kac tane link oldugunu bulun. */




    }
}
