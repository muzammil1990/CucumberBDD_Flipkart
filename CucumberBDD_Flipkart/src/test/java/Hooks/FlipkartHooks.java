package Hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

//Hooks Separate configuration class
public class FlipkartHooks {

  //multiple hooks can be associated.
  @Before(order=1)
  public void launchBrowser() {
      System.out.println("launch chrome browser");
  }
  
  @Before(order=2)
  public void launchURL() {
      System.out.println("launch url");
  }

  @After(order=2)
  public void closeBrowser() {
      System.out.println("close the browser");
  }
  
  @After(order=1)
  public void tearDown_logout() {
      System.out.println("logout from application");
  }
  
  
  /*@BeforeStep // import from package io.cucumber
  public void takescreenshot(){
      System.out.println("take the screenshot");
  }
  
  @AfterStep
  public void refreshPage(){
      System.out.println("Refresh the page");
  }*/
  
  
  
}
