package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Authorization
{
    public static void main( String[] args )
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized"); // полноэкранное открытие страницы
        options.addArguments("--incognito"); // открытие страницы в режиме инкогнито
        options.addArguments("disable-popup-blocking");

        WebDriver driver;
        driver = new ChromeDriver(options);
//        driver.manage().window().fullscreen();

        driver.get("https://learnenglishkids.britishcouncil.org/");
        // подтверждаем куки чтобы глаз не мазолили
        driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
//        отдельный элемент
        WebElement webElement = driver.findElement(By.id("lang-dropdown-select-language"));
//        отдельный клик
        webElement.click();
//        не возвращаем Элемент, находим и сразу клик // выбор Eng языка
        driver.findElement(By.xpath("//*[@id=\"lang-dropdown-select-language\"]/*[text()=\"English\"]")).click();
//        находим и жмём Log in
        driver.findElement(By.xpath("//div[@id='header-bar']//a[text()='Log in']")).click();
        driver.findElement(By.xpath("//input[@type='text' and @id='edit-name']")).sendKeys("Sergei_1");
        driver.findElement(By.xpath("//input[@id='edit-pass']")).sendKeys("ASdf123Q");
        driver.findElement(By.id("edit-submit")).submit();



    }
}
