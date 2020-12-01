package com.cybertek.tests.day02_getTax;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekURLVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com");
        driver.manage().window().maximize();
        String expectedURL = "cybertekschool";
        String actualURL = driver.getCurrentUrl();
        if (actualURL.contains(expectedURL)){
            System.out.println("URL verification passed!");
        }else {
            System.out.println("URL verification failed!");
        }
        if (driver.getTitle().equals("Practice")){
            System.out.println("Title verification passed!");
        }else {
            System.out.println("Title verification failed!");
        }






        driver.close();

    }
}
