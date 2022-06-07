package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.CarsHomePage;
import pages.CarsSingInPage;
import utilities.Driver;
import utilities.Waiter;

import java.util.concurrent.TimeUnit;

public class Base {
    WebDriver driver;
    WebDriverWait explicitWait;
    FluentWait fluentWait;
    CarsHomePage carsHomePage;
    CarsSingInPage carsSingInPage;
    //Page objects declarations


    @BeforeMethod
    public void setup(){
        driver = Driver.getDriver("chrome");
        explicitWait = new WebDriverWait(driver, 30);
        fluentWait =  new FluentWait(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS).ignoring(Exception.class);
        carsHomePage = new CarsHomePage(driver);
        carsSingInPage = new CarsSingInPage(driver);
    }

    @AfterMethod
    public void teardown(){
        Driver.quitDriver();
    }
}
