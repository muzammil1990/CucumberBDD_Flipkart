package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
     
    WebDriver driver;

    Assert asrt;

    @Given("^User is already present in login page$")
   public void userPresentInLoginPage() {
        System.setProperty("webdriver.chrome.driver", "./resources/Drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.flipkart.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @When("^title of the page is Online shopping site for mobiles, electronics, Furniture, Grocery, Lifestyle Books & More$")
    public void titleOfPage() {

        String title = driver.getTitle();
        asrt.assertEquals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!", title);
    }

    // Regular Expression:
    // 1. \"(.*)\"
    // 2. \"([^\"]*)\"

    @Then("^user enters \"(.*)\" and \"(.*)\"$")
    public void user_enters_username_and_password(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//form[@autocomplete='on']/div[1]/input")).sendKeys(username);
        driver.findElement(By.xpath("//form[@autocomplete='on']/div[2]/input")).sendKeys(password);

    }

    @Then("^user clicks on login button$")
    public void user_clicks_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        // another_xpath= //button[@type='submit']/span[text()='Login']
        driver.findElement(By.xpath("//button[@type='submit']/div/following-sibling::span")).click();
    }

    @Then("^user is in home page$")
    public void user_is_in_home_page() {
        // Write code here that turns the phrase above into concrete actions
        String actualValue = driver.getTitle();
        String expectedValue = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
        asrt.assertEquals(expectedValue, actualValue);
    }

    @Then("^close the browser$")
    public void closeBrowser() {
        driver.quit();
    } 

}
