package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XPathSelectors {
    WebDriver driver = new ChromeDriver();

    @Test
    public void methodXPath(){
        driver.get("https://telranedu.web.app/login");
        WebElement inpuEmail = driver.findElement(By.xpath("//form/input[1]"));
        inpuEmail.sendKeys("my_email@mail.com");



        WebElement btnRegistration = driver.findElement(By.xpath("//form/button[last()]"));
        btnRegistration.click();

    }
}
