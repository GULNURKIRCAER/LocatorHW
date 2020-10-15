package Locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCase3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.wikipedia.org");

        WebElement searchButton=driver.findElement(By.id("searchInput"));

        searchButton.sendKeys("selenium webdriver");
        Thread.sleep(1000);

        WebElement submitButton=driver.findElement(By.xpath("//i[@class='sprite svg-search-icon']"));

        submitButton.click();

        WebElement newWord= driver.findElement(By.partialLinkText("Selenium (software)"));

        Thread.sleep(3000);

        newWord.click();

        String URL = driver.getCurrentUrl();

        if(URL.endsWith("Selenium_(software)")) {
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        Thread.sleep(3000);


        driver.quit();


    }
}
