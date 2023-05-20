package LoginTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTestUdemy {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeMethod
    public void startUp() {
        System.setProperty("web.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.udemy.com/join/login-popup");
    }

    @AfterMethod
    public void tearDown () throws InterruptedException {
        Thread.sleep(4000);
        driver.close();
    }

    @Test
    public void udemy_udemyLogin() throws InterruptedException {

        By emailFieldLocator = By.xpath("//*[@name='email']");
        WebElement emailField = driver.findElement(emailFieldLocator);

        By passwordFieldLocator = By.xpath("//*[@name='password']");
        WebElement passwordField = driver.findElement(passwordFieldLocator);

        By buttonLocator = By.xpath("(//*[@type= 'submit'])[2]");
        WebElement button = driver.findElement(buttonLocator);

        emailField.sendKeys("utesttatiana@gmail.com");

        passwordField.sendKeys("password1");

        button.click();
    }
}
