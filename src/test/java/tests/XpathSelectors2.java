package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XpathSelectors2 {
    WebDriver driver = new ChromeDriver();

    @Test
    public void selectorTextBox(){
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        hideBanner();
        hideFooter();

        WebElement inputFillName = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        inputFillName.sendKeys("Hello");

        //*[text()='Current Address']
        WebElement inputEmail = driver.findElement(By.xpath("//form/div[@id='userEmail-wrapper']//input"));
        inputEmail.sendKeys("Hello");

        WebElement inputCurAdd = driver.findElement(By.xpath("//*[text()='Current Address']"));
        System.out.println(inputCurAdd.getText());
        WebElement CurAdd = driver.findElement(By.xpath("//*[text()='Current Address']/../..//textarea"));
        CurAdd.sendKeys("hey");




        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
    private void hideBanner(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('#fixedban').style.display='none'");
    }
    private void hideFooter() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('footer').style.display='none'");

    }
}
