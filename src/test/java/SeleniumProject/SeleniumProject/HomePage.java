package SeleniumProject.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    public By searchBox=By.xpath("//div[@class='nav-fill']//child::input[@id='twotabsearchtextbox']");
    public  By  magni= By.id("nav-search-submit-button");
    
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void search(String name) {

       
             driver.findElement(searchBox).sendKeys(name);
            

    }
    public void tap() {

        
        driver.findElement(magni).click();
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");

}
       
        
    
}