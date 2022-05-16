package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04 {
    public static void main(String[] args) {
        // ...Exercise4...
// Navigate to  https://testpages.herokuapp.com/styled/index.html
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testpages.herokuapp.com/styled/index.html");

// Click on  Calculate under Micro Apps
        driver.findElement(By.xpath("//a[@id='calculatetest']")).click();

//    Type any number in the first input
        driver.findElement(By.id("number1")).sendKeys("30");
//    Type any number in the second input
        driver.findElement(By.id("number2")).sendKeys("20");
// Click on Calculate
        driver.findElement(By.id("calculate")).click();
// Get the result
// Print the result
        System.out.println(driver.findElement(By.id("answer")).getText());
        driver.close();





    }

}
