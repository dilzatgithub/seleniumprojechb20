package com.cybertek.tests.day02_getTax;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.findElement(By.className("_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy")).click();













    }
}
