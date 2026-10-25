
package utils;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

    WebDriver driver;

    public DropDown(WebDriver driver) {
        this.driver = driver;
    }

    public void dropDown() {

        WebElement dropdown =
                driver.findElement(By.id("searchDropdownBox"));

        Select select = new Select(dropdown);

        // Print all dropdown options
        List<WebElement> options = select.getOptions();

        System.out.println("Total options: " + options.size());

        for (WebElement option : options) {
            System.out.println(option.getText());
        }

        // Select Books
        select.selectByValue("search-alias=stripbooks");

        System.out.println("Books selected successfully");
    }
}
