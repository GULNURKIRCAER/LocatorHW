package Locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCase2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.ebay.co.uk/");

        WebElement searchButton=driver.findElement(By.id("gh-ac"));

        searchButton.sendKeys("Selenium");

        WebElement submitButton=driver.findElement(By.id("gh-btn"));

        submitButton.click();

        String title = driver.getTitle();


        if(title.contains("Selenium")){
            System.out.println("PASS");

        }else{
            System.out.println("FAIL");
        }

        driver.quit();
    }
}
