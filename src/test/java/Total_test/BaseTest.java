
package Total_test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import utils.drivers;


public class BaseTest extends drivers {
	
    @BeforeTest
    public void setup() {

        System.out.println("BaseTest setup called");

        drivers.initDriver();
    }
    @AfterMethod
    public void tearDown() {
        drivers.quitDriver();
        System.out.println("Browser closed");
    }
}
