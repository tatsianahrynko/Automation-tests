package RegistrationTests;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationCoursera {

        private WebDriver driver;
        private WebDriverWait wait;
        private Faker faker;

        @BeforeMethod
        public void startUp() {
            faker = new Faker();
            System.setProperty("web.chrome.driver", "chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://www.coursera.org/?authMode=signup");
        }

        @AfterMethod
        public void tearDown () throws InterruptedException {
            Thread.sleep(4000);
            driver.close();
        }

        @Test
        public void coursera_courseraRegistration() throws InterruptedException {

            String email = faker.internet().emailAddress();
            String userName = faker.name().firstName();

            By emailFieldLocator = By.xpath("//*[@id='email']");
            WebElement emailField = driver.findElement(emailFieldLocator);


            By nameFieldLocator = By.xpath("//*[@placeholder='Enter your full name']");
            WebElement nameField = driver.findElement(nameFieldLocator);

            By passwordFieldLocator = By.xpath("//*[@placeholder='Create password']");
            WebElement passwordField = driver.findElement(passwordFieldLocator);

            By buttonLocator = By.xpath("//*[@class='_6dgzsvq css-1af0gyj']");
            WebElement button = driver.findElement(buttonLocator);

            emailField.sendKeys(email);
            nameField.sendKeys(userName);
            passwordField.sendKeys("Password1");
            button.click();
            System.out.println("User Email: " + email);
        }
    }

