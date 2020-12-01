package com.cybertek.tests.day03_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class amazon_cssSelector {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://accounts.google.com/signup" +
                "/v2/webcreateaccount?service=mail&continue" +
                "=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dtopnav" +
                "-about-n-en&flowName=GlifWebSignIn&flowEntry=SignUp");
        WebElement firstName =driver.findElement(By.cssSelector("input[name='firstName']"));
        firstName.sendKeys("tommy");
        WebElement lastName = driver.findElement(By.cssSelector("input[name='lastName']"));
        lastName.sendKeys("Osman");
        WebElement email = driver.findElement(By.cssSelector("input[name='Username']"));
        email.sendKeys("TommyOsman1200");
        WebElement passWD = driver.findElement(By.cssSelector("input[name='Passwd']"));
        passWD.sendKeys("GGesportdani12345");
        WebElement comPW = driver.findElement(By.cssSelector("input[name='ConfirmPasswd']"));
        comPW.sendKeys("GGesportdani12345");
        WebElement nextButton = driver.findElement(By.cssSelector("span[class='RveJvd snByac']"));
        nextButton.click();






//        WebElement GmailLink = driver.findElement(By.linkText("Gmail"));
//        GmailLink.click();
//        WebElement CreateAccountLink = driver.findElement(By.linkText("Create an Account"));
//        CreateAccountLink.click();
//        WebElement searchBox = driver.findElement(By.cssSelector
//                ("input[class='nav-input']"));
//        searchBox.sendKeys("poker" + Keys.ENTER);





    }
}
