package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main( String[] args )
    {
        WebDriverManager.chromedriver().setup();

        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://google.com");
    }
}
