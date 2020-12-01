package com.cybertek.tests.day02_getTax;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_GmailVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.linkText("Gmail")).click();
        String expectedInTitle = "Gmail";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedInTitle)){
            System.out.println("Gmail Title verification PASSED!");
        }else{
            System.out.println("Gmail Title verification FAILED!!!");
        }
        driver.navigate().back();
        String expectedGoogleTitle = "Google";
        String actualGoogleTitle = driver.getTitle();
        if (expectedGoogleTitle.contains(actualGoogleTitle)){
            System.out.println("Google Title verification PASSED!!");
        }else {
            System.out.println("Google Title verification FAILED!!");
        }













    }
}
