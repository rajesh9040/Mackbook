package SeleniumProject.SeleniumProject;

import org.testng.annotations.Test;
import utils.Driver;

public class HomeTest extends Base {

    @Test
    public void searchIphone() {

        HomePage home = new HomePage(Driver.getDriver());

        home.search("iPhone");

        
    }
}