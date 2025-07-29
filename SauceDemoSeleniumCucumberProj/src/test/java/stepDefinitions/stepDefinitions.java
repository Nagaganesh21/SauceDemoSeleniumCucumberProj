package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class stepDefinitions {
    private WebDriver driver;
    private static final int IMPLICIT_WAIT = 10;

    @Before
    public void setUp() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));
        driver.manage().window().maximize();
    }

    @Given("I open the login page")
    public void i_open_the_login_page() {
        driver.get("https://www.saucedemo.com/v1/");
    }

    @When("I enter valid username and password")
    public void i_enter_valid_username_and_password() {
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
    }
    @And("I click on login button")
    public void i_click_on_login_button() {
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
    }
    @Then("I should see the Home page")
    public void i_should_see_the_home_page() {
        String text = driver.findElement(By.xpath("//div[@class='product_label']")).getText();
        if (text.equals("Products")) {
            System.out.println("Login successful");
        }
    }
    @And("Close the browser")
    public void close_the_browser() {
        driver.quit();
    }

    @When("I enter valid {string} and {string}")
    public void i_enter_valid_and(String uname, String psd) {
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uname);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(psd);
    }
}
