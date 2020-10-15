package Locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase1 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.ebay.co.uk/");

        WebElement searchButton=driver.findElement(By.id("gh-ac"));

        searchButton.sendKeys("table");

        WebElement submitButton=driver.findElement(By.id("gh-btn"));

        submitButton.click();

        WebElement result= driver.findElement(By.partialLinkText("300"));

        System.out.println("number of results= "+result.getText());


        driver.quit();





    }
}
