/**
 * 
 */
package stepdefinition;

/**
 * with Examples keyword- Data Driven Approach
 */
public class SelectMobileStepDefinition {
 
 //   @Given("^User is already present in login page$")
//  public void userPresentInLoginPage() {
//      System.setProperty("webdriver.chrome.driver", "./resources/Drivers/chromedriver.exe");
//
//      driver = new ChromeDriver();
//      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//      driver.get("https://www.flipkart.com");
//      driver.manage().window().maximize();
//      driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//  }
//
//  @When("^title of the page is Online shopping site for mobiles, electronics, Furniture, Grocery, Lifestyle Books & More$")
//  public void titleOfPage() {
//
//      String title = driver.getTitle();
//      asrt.assertEquals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!", title);
//  }
//
//  // Regular Expression:
//  // 1. \"(.*)\"
//  // 2. \"([^\"]*)\"
//
//  @Then("^user enters \"(.*)\" and \"(.*)\"$")
//  public void user_enters_username_and_password(String username, String password) {
//      // Write code here that turns the phrase above into concrete actions
//      driver.findElement(By.xpath("//form[@autocomplete='on']/div[1]/input")).sendKeys(username);
//      driver.findElement(By.xpath("//form[@autocomplete='on']/div[2]/input")).sendKeys(password);
//
//  }
//
//  @Then("^user clicks on login button$")
//  public void user_clicks_on_login_button() {
//      // Write code here that turns the phrase above into concrete actions
//      // another_xpath= //button[@type='submit']/span[text()='Login']
//      driver.findElement(By.xpath("//button[@type='submit']/div/following-sibling::span")).click();
//  }
//
//  @Then("^user is in home page$")
//  public void user_is_in_home_page() {
//      // Write code here that turns the phrase above into concrete actions
//      String actualValue = driver.getTitle();
//      String expectedValue = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
//      asrt.assertEquals(expectedValue, actualValue);
//  }
//
//  @Then("^user selects mobile in menu option$")
//  public void user_selects_mobile_in_menu_option() {
//      // Write code here that turns the phrase above into concrete actions
//      // driver.findElement(By.xpath("//div[contains(text(),'Mobiles')]")).click();
//
//      WebDriverWait wait = new WebDriverWait(driver, 20);
//      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Mobiles')]"))).click();
//  }
//
//  @Then("^user clicks on motorolla phone ad$")
//  public void user_clicks_on_motorolla_phone_ad() {
//      // Write code here that turns the phrase above into concrete actions
//      driver.findElement(By.xpath("//img[@alt='Sale is On']/following-sibling::img")).click();
//  }
//
//  @Then("^user selects specific model$")
//  public void user_selects_specific() {
//      // Write code here that turns the phrase above into concrete actions
//
//      driver.findElement(By.xpath("div[contains(text(),'MOTOROLA G10 Power (Aurora Grey, 64 GB)')]")).click();
//      
//  }
//
//  @Then("^close the browser$")
//  public void closeBrowser() {
//       driver.quit();
//  }
}
