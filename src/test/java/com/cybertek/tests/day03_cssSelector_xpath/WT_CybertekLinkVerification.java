package com.cybertek.tests.day03_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WT_CybertekLinkVerification {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.findElement(By.name("email"))
                .sendKeys("deebrillla@gmail.com");
        driver.findElement(By.id("form_submit")).click();
        String expectedURL = "email_sent";
        String actualURL = driver.getCurrentUrl();
        if (actualURL.contains(expectedURL)){
            System.out.println("URL verification PASSED!!");
        }else {
            System.out.println("URL verification FAILED!!");
        }

        String actualText = driver.findElement(By.name("confirmation_message")).getText();
        String expectedText = "Your e-mail's been sent!";
        if (actualText.equals(expectedText)){
            System.out.println("Header text verification Passed!!");
        }else {
            System.out.println("Header text verification failed!!");
        }


        boolean confirmation_message = driver.findElement(By.name("confirmation_message")).
                isDisplayed();
        if (confirmation_message){
            System.out.println("confirmation message is displayed");
        }else {
            System.out.println("confirmation message is not displayed");
        }


    }
}
