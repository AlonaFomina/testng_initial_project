package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import utilities.Driver;

public class Base {
    WebDriver driver;

    //Page objects declarations


    @BeforeMethod
    public void setup(){
        driver = Driver.getDriver("chrome");

    }
}
