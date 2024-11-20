package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SelectorsCss {
    WebDriver driver = new ChromeDriver();
    @Test
    public void elementsHeaderIlCarro(){
        driver.navigate().to("https://ilcarro.web.app/search");
        WebElement elementText = driver.findElement(By.cssSelector("h1"));
        System.out.println(elementText.getText());

        driver.quit();

    }
}
