package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazingSuperSongCHeck {
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

        // Listen and radio
//        на это не хочет нажимать, сама кнопка-текст 🤷‍
//        driver.findElement(By.xpath("//div[@id=\"navigation\"]//ul[@id=\"superfish-1\"]//*[@href=\"/listen-watch\"]")).click();
//        тоже не работает((
        driver.findElement(By.xpath("//*[@id='menu-60717-1']//a[@href='/songs']")).click();

        driver.quit();



    }
}
