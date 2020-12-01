package com.cybertek.tests.day01_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws Exception{
        //1.Setup the driver
        WebDriverManager.chromedriver().setup();
        //2.Create instance of a driver
        WebDriver driver = new ChromeDriver();
        //3. Use the driver instance to test selenium
        driver.get("https://www.google.com");
//        String actualURL = driver.getCurrentUrl();
//        System.out.println("actualURL = " + actualURL);
//        Thread.sleep(3000);
//        driver.navigate().back();
//        Thread.sleep(3000);
//        driver.navigate().forward();
//        Thread.sleep(3000);
//        driver.navigate().refresh();
//        Thread.sleep(3000);
//        driver.navigate().to("https://www.baidu.com");
//        driver.navigate().to("https://www.facebook.com");
//        driver.navigate().to("https://www.youtube.com");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        
        driver.close();


    }
}
