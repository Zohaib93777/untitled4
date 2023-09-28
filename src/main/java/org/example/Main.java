package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
import java.util.concurrent.TimeUnit;

class Main {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver","D:\\QA Softwares\\FireFox\\geckodriver.exe");
        WebDriver driver = (WebDriver) new FirefoxDriver();
        driver.get("https://ableequipment.com/");

        //Accepting Cookies btn click.
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/a")).click(); //clicking on "Contact" btn

        driver.findElement(By.xpath("/html/body/app-root/app-request-quote/div/div/div/div/div/aw-wizard/div/aw-wizard-step[3]/div/div/div/div/div/div/div[2]/button[2]")).click();
    }

}