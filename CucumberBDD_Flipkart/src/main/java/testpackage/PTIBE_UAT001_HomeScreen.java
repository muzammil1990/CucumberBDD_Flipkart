package testpackage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PTIBE_UAT001_HomeScreen {
    WebDriver driver;

    public void invokeBrowser(){
        System.setProperty("webdriver.chrome.driver", "./resources/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.get("https://vehicleregulateddata-qa.acps-alpha-r1.srv.volvo.com/home");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    public void homeScreen(){

        //Arcade Heading
        String actualPageHeading = driver.findElement(By.xpath("/html/body/jsvs-root/jsvs-navigation-bar-section/jsvs-navigation-bar/nav/div/div[2]/div[1]/h1")).getText();
        String expectedPageHeading = "Arcade";
        System.out.println("Actual Page Heading: "+actualPageHeading);
        Assert.assertEquals(expectedPageHeading,actualPageHeading);
        System.out.println("Home screen page heading assert passed");

        //Home tab
        String actualHomeTab = driver.findElement(By.xpath("/html/body/jsvs-root/jsvs-navigation-bar-section/jsvs-navigation-bar/nav/div/div[2]/div[2]/div[1]/kendo-menu/ul/li[1]/div/a")).getText();
        String expectedHomeTab = "Home";
        System.out.println("Actual Home tab name: "+actualHomeTab);
        Assert.assertEquals(expectedHomeTab,actualHomeTab);
        System.out.println("Home tab is present");

        //Search tab
        String actualSearchTab = driver.findElement(By.xpath("/html/body/jsvs-root/jsvs-navigation-bar-section/jsvs-navigation-bar/nav/div/div[2]/div[2]/div[1]/kendo-menu/ul/li[2]/div/a")).getText();
        String expectedSearchTab = "Search";
        System.out.println("Actual Search tab name: "+actualSearchTab);
        Assert.assertEquals(expectedSearchTab,actualSearchTab);
        System.out.println("Search tab is present");

        //Translate tab
        String actualTranslateTab = driver.findElement(By.xpath("/html/body/jsvs-root/jsvs-navigation-bar-section/jsvs-navigation-bar/nav/div/div[2]/div[2]/div[1]/kendo-menu/ul/li[3]/div/a")).getText();
        String expectedTranslateTab = "Translate";
        System.out.println("Actual Translate tab name: "+actualTranslateTab);
        Assert.assertEquals(expectedTranslateTab,actualTranslateTab);
        System.out.println("Translate tab is present");

        //Import tab
        String actualImportTab = driver.findElement(By.xpath("/html/body/jsvs-root/jsvs-navigation-bar-section/jsvs-navigation-bar/nav/div/div[2]/div[2]/div[1]/kendo-menu/ul/li[4]/div/a")).getText();
        String expectedImportTab = "Import";
        System.out.println("Actual Import tab name: "+actualImportTab);
        Assert.assertEquals(expectedImportTab,actualImportTab);
        System.out.println("Import tab is present");

        //Setup tab
        String actualSetupTab = driver.findElement(By.xpath("/html/body/jsvs-root/jsvs-navigation-bar-section/jsvs-navigation-bar/nav/div/div[2]/div[2]/div[1]/kendo-menu/ul/li[5]/div/a")).getText();
        String expectedSetupTab = "Set-up";
        System.out.println("Actual Setup tab name: "+actualSetupTab);
        Assert.assertEquals(expectedSetupTab,actualSetupTab);
        System.out.println("Setup tab is present");

        //Users tab
        String actualUserTab = driver.findElement(By.xpath("/html/body/jsvs-root/jsvs-navigation-bar-section/jsvs-navigation-bar/nav/div/div[2]/div[2]/div[1]/kendo-menu/ul/li[6]/div/a")).getText();
        String expectedUserTab = "Users";
        System.out.println("Actual User tab name: "+actualUserTab);
        Assert.assertEquals(expectedUserTab,actualUserTab);
        System.out.println("User tab is present");

        //Help tab
        String actualHelpTab = driver.findElement(By.xpath("/html/body/jsvs-root/jsvs-navigation-bar-section/jsvs-navigation-bar/nav/div/div[2]/div[2]/div[1]/kendo-menu/ul/li[7]/div/a")).getText();
        String expectedHelpTab = "Help";
        System.out.println("Actual User tab name: "+actualHelpTab);
        Assert.assertEquals(expectedHelpTab,actualHelpTab);
        System.out.println("Help tab is present");

        //Vins due for publishing
        String actualVinPublishDashboard = driver.findElement(By.xpath("/html/body/jsvs-root/jsvs-home/div/div/div[1]/div/div[1]/h3")).getText();
        String expectedVinPublishDashboard = "VINs due for publishing within a month";
        System.out.println("Actual VINs publish dashboard frame: "+actualVinPublishDashboard);
        Assert.assertEquals(expectedVinPublishDashboard,actualVinPublishDashboard);
        System.out.println("VINs publish dashboard list is present");

        //Vins with Obsolete requirement
        String actualVinObsoleteDashboard = driver.findElement(By.xpath("/html/body/jsvs-root/jsvs-home/div/div/div[2]/div/div[1]/h3")).getText();
        String expectedVinObsoleteDashboard = "VINs with requirement status as Obsolete";
        System.out.println("Actual Obsolete VINs dashboard frame: "+actualVinObsoleteDashboard);
        Assert.assertEquals(expectedVinObsoleteDashboard,actualVinObsoleteDashboard);
        System.out.println("Obsolete VINs dashboard list is present");
    }

    public void search(){
        //VINs due for publishing within a month
        driver.findElement(By.xpath("/html/body/jsvs-root/jsvs-home/div/div/div[1]/div/div[2]/kendo-grid/div/div/div/table/thead/tr[2]/td[1]/kendo-grid-string-filter-cell/kendo-grid-filter-wrapper-cell/input")).sendKeys("VF611A369MD027020");
        driver.findElement(By.xpath("/html/body/jsvs-root/jsvs-home/div/div/div[1]/div/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[1]/a")).click();
        String actualRequirementId= driver.findElement(By.xpath("//*[@id=\"k-tabstrip-tabpanel-1\"]/app-truckdetails/div/div/kendo-grid/kendo-grid-group-panel/div[1]/div/a[1]")).getText();
        System.out.println("Search Result: "+actualRequirementId);
        String expectedRequirementId = "Requirement ID";
        Assert.assertEquals(expectedRequirementId,actualRequirementId);
    }

    public void closeBrowser(){
        driver.quit();
    }


    public static void main(String args[]) {
        PTIBE_UAT001_HomeScreen home = new PTIBE_UAT001_HomeScreen();
        home.invokeBrowser();
        home.homeScreen();
        home.search();
        home.closeBrowser();
    }
}
