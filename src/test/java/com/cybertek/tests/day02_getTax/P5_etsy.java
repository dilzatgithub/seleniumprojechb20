package com.cybertek.tests.day02_getTax;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P5_etsy {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com");
        driver.findElement(By.id("global-enhancements-search-query")).
                sendKeys("wdoden spoon" + Keys.ENTER);










    }
}
