package LoginTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTestMern {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeMethod
    public void startUp() {
        System.setProperty("web.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://mern-ecommerce.sdet.school/login");
    }

    @AfterMethod
    public void tearDown () throws InterruptedException {
        Thread.sleep(4000);
        driver.close();
        }

    @Test
    public void mern_mernLogin() throws InterruptedException {

        By emailFieldLocator = By.xpath("(//*[@name='email'])[1]");
        WebElement emailField = driver.findElement(emailFieldLocator);

        By passwordFieldLocator = By.xpath("//*[@type='password']");
        WebElement passwordField = driver.findElement(passwordFieldLocator);

        By buttonLocator = By.xpath("(//*[@class='input-btn custom-btn-primary md text-only icon-left '])[1]");
        WebElement button = driver.findElement(buttonLocator);

        emailField.sendKeys("utesttatiana@gmail.com");

        passwordField.sendKeys("password1");

        button.click();
    }
}



