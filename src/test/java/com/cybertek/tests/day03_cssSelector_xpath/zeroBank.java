package com.cybertek.tests.day03_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zeroBank {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");
        WebElement zeroBankLinkTopLeft = driver.findElement(By.className("brand"));
        String expectedLinkText = "Zero Bank";
        String actualLinkText = zeroBankLinkTopLeft.getText();

        if (actualLinkText.equals(expectedLinkText)){
            System.out.println("Link Text Top Left is verification PASSED!!");
        }else {
            System.out.println("Link Text Top Left is verification FAILED!!");
        }

        String expectedHref = "index.html";
        String actualHref = zeroBankLinkTopLeft.getAttribute("href");
        if (actualHref.contains(expectedHref)){
            System.out.println("Href value verification is PASSED!!");
        }else {
            System.out.println("Href value verification is FAILED!!");

        }






    }
}
