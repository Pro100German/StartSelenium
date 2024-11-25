package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XPathILCarro {
    WebDriver driver = new ChromeDriver();

    @Test
    public void typeRegForm(){
        driver.get("https://ilcarro.web.app/login?url=%2Fsearch");
        driver.manage().window().maximize();

        WebElement inputFullEmail = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
        inputFullEmail.sendKeys("german@mail.com");
        WebElement inputFullPassword = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
        inputFullPassword.sendKeys("1234");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}
