package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03 {
    public static void main(String[] args) throws InterruptedException {
        // ...Exercise3...
// go to url : https://www.techlistic.com/p/selenium-practice-form.html
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
       driver.findElement(By.xpath("//a[@id='cookieChoiceDismiss']")).click();  //cookies i kapatmadan olmadi bunla kapattik
//fill the firstname
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ilker");
        //driver.findElement(By.name("firstname")).sendKeys("Ilker"); buda olur

//fill the lasttname
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kaya");
//check the gender
        driver.findElement(By.xpath("//input[@value='Male']")).click();
        //driver.findElement(By.id("sex-0")).click(); buda olur
//check the experience
        driver.findElement(By.xpath("//input[@value='3']")).click();
//fill the date
        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("10.10.1995");

//choose your profession -> Automation Tester
        driver.findElement(By.xpath("//input[@id='profession-1']")).click();

//choose your tool -> Selenium Webdriver
        driver.findElement(By.xpath("//input[@id='tool-2']")).click();

//choose your continent -> Antartica
        driver.findElement(By.xpath("//option[text()='Antartica']")).click();

//choose your command  -> Browser Commands
        driver.findElement(By.xpath("option[text()='Browser Commands']")).click();

//click submit button
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@id='submit']")).click();

    driver.close();
    }
}
