package Hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

//Hooks Separate configuration class
public class FlipkartTaggedHooks {
 
    //tagged hooks
    //Hooks  //tags
    @Before("@Smoke")  
    public void launchBrowser() {
        System.out.println("launch chrome browser");
    }
   
//    @Before(order=2)
//    public void launchURL() {
//        System.out.println("launch url");
//    }

//    @After(order=2)
//    public void closeBrowser() {
//        System.out.println("close the browser");
//    }
    
    @After("@Smoke")
    public void tearDown_logout() {
        System.out.println("logout from application");
    }
    
}
