package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04Ben {
    /*
    1-amazon.com a gidip arama kutusunu locate edin
    2-arama kutusunuz tagName inin input oldugunu test edin
    3-arama kutusunun name attrbute nin degerinin field-keywords oldugunu test edin
     */
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1-amazon.com a gidip arama kutusunu locate edin
        driver.get("https://www.amazon.com");
        WebElement aramaCubugu = driver.findElement(By.id("twotabsearchtextbox"));

        // 2-arama kutusunun tagName inin input oldugunu test edin
        String expectedTagName = "input";
        String actuelTagName = aramaCubugu.getTagName();

        if (expectedTagName.equals(actuelTagName)) {
            System.out.println("Tag Ismi Testi : PASSED");
        } else
            System.out.println("Tag Ismi Testi : FAILED");


        // 3-arama kutusunun name attrbute nin degerinin field-keywords oldugunu test edin
        String expectedNameAttrbute = "field-keywords";
        String actuelNameAttrbute = aramaCubugu.getAttribute("name");

        if (expectedNameAttrbute.equals(actuelNameAttrbute)) {
            System.out.println("Attrbute ismi Testi : PASSED");
        } else
            System.out.println("Attribute Ismi Testi : FAILED");

        driver.close();

    }
}
/*<input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off"
placeholder="" class="nav-input nav-progressive-attribute" dir="auto"
tabindex="0" aria-label="Search">
 */