
package Total_test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.qameta.allure.testng.AllureTestNg;

import utils.drivers;
import utils.HomePage;
import utils.Waiting;

@Listeners({
    AllureTestNg.class,
    TestListeners.class
})
public class HomeTest extends BaseTest {

    @Test
    public void Home() {

        WebDriver driver = drivers.getDriver();

        HomePage home = new HomePage(driver);
        Waiting w = new Waiting(driver);

        home.search("iphone 18 pro");
        w.time();

        home.cart();
        w.time();

        home.item();
    }
}
