package com.cybertek.tests.day03_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class xpath_cybertek {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.get("http://practice.cybertekschool.com");
        WebElement multipleButtons = driver.findElement(By.linkText("Multiple Buttons"));
        multipleButtons.click();
        WebElement button1 = driver.findElement(By.xpath("//button[@onclick='button1()']"));
       // WebElement button1 = driver.findElement(By.xpath("//button["));
                button1.click();


    }
}
