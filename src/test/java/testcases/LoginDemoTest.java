package testcases;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


@RunWith(SerenityRunner.class)
public class LoginDemoTest extends PageObject {

    @Managed
    WebDriver driver;


    String email = "";
    String password = "";

    @Test
    public void doRegister(){
        driver.get("https://rahulshettyacademy.com/client");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement registerbtn = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//a[contains(@href,'register')]")));
        registerbtn.click();
    }
}
