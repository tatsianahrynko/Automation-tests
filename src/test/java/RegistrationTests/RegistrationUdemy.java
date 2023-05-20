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

public class RegistrationUdemy {

    private WebDriver driver;
    private WebDriverWait wait;
    private Faker faker;

    @BeforeMethod
    public void startUp() {
        faker = new Faker();
        System.setProperty("web.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.udemy.com/join/signup-popup");
    }

    @AfterMethod
    public void tearDown () throws InterruptedException {
        Thread.sleep(4000);
        driver.close();
    }

    @Test
    public void udemy_udemyRegistration() throws InterruptedException {

        //String userEmail = faker.internet().emailAddress();//generated user email

        By emailFieldLocator = By.xpath("//*[@name='email']");
        WebElement emailField = driver.findElement(emailFieldLocator);

        /*String userName = faker.name().firstName(); //generated name
        System.out.println(userName);*/
        //String lastName = faker.name().lastName(); //generated lastName
        //System.out.println(lastName);


        By nameFieldLocator = By.xpath("//*[@name= 'fullname']");
        WebElement nameField = driver.findElement(nameFieldLocator);

        By passwordFieldLocator = By.xpath("//*[@name= 'password']");
        WebElement passwordField = driver.findElement(passwordFieldLocator);

        By buttonLocator = By.xpath("(//*[@type= 'submit'])[2]");
        WebElement button = driver.findElement(buttonLocator);

        //String userEmail = faker.internet().emailAddress();//generated user email
        emailField.sendKeys(faker.internet().emailAddress());
        nameField.sendKeys(faker.name().firstName());
        passwordField.sendKeys("Password1");
        button.click();





/*
        String newName = faker.artist().name();
        mainPage.renamePlaylist(playlistId, newName);
*/

        /*By emailFieldLocator = By.xpath("//*[@name='email']");
        WebElement emailField = driver.findElement(emailFieldLocator);*/

        /*By passwordFieldLocator = By.xpath("//*[@name='password']");
        WebElement passwordField = driver.findElement(passwordFieldLocator);

        By buttonLocator = By.xpath("(//*[@type= 'submit'])[2]");
        WebElement button = driver.findElement(buttonLocator);

        emailField.sendKeys("utesttatiana@gmail.com");

        passwordField.sendKeys("password1");

        button.click();*/
    }
}
