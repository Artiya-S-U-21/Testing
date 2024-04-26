package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cc2 {
    WebDriver driver;
 @Test
 public void test1() throws InterruptedException
 {
        
     WebDriverManager.chromedriver().setup();
     driver=new ChromeDriver();
     driver.get("https://www.barnesandnoble.com");
     driver.findElement(By.xpath("//*[@id='rhf_header_element']/nav/div/div[3]/form/div/div[1]/a")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//*[@id='rhf_header_element']/nav/div/div[3]/form/div/div[1]/div/a[2]")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//*[@id='rhf_header_element']/nav/div/div[3]/form/div/div[2]/div/input[1]")).sendKeys("Chetan Bhagat");
     Thread.sleep(3000);
     String s=driver.findElement(By.xpath("//*[@id='searchGrid']/div/section[1]/section[1]/div/div[1]/div[1]/h1/span")).getText();
     driver.findElement(By.xpath("//*[@id='rhf_header_element']/nav/div/div[3]/form/div/span/button")).click();
     Thread.sleep(3000);
     if(s.equals("Chetan Bhagat"))
     {
         System.out.print("Pass");
        }
        else{
            System.out.print("Fail");
        }
    }
    @Test
    public void test2() throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.barnesandnoble.com");
        driver.findElement(By.xpath("//*[@id='onetrust-close-btn-container']/button")).click();
        Thread.sleep(2000);
        Actions action=new Actions(driver);
        WebElement source=driver.findElement(By.xpath("//*[@id='rhf_header_element']/nav/div/div[3]"));
        WebElement dest=driver.findElement(By.xpath("//*[@id='rhfCategoryFlyout_Audiobooks']"));
        action.dragAndDrop(source,dest).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='navbarSupportedContent']/div/ul/li[5]/div/div/div[1]/div/div[2]/div[1]/dd/a[1]")).click();
        Thread.sleep(2000);
        JavascriptExecutor js=(JavascriptExecutor) driver;//scroll
        js.executeScript("window.scrollBy(0,1500)");//scroll
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='addToBagForm_2940159543998']/input[11]")).click();
    }
    @Test
    public void test3() throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.barnesandnoble.com");
        driver.findElement(By.xpath("//*[@id='onetrust-close-btn-container']/button")).click();
        Thread.sleep(10000);
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(22, 1000)");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/main/div[3]/div[3]/div/section/div/div/div/a[1]/span")).click();

           
    }

}