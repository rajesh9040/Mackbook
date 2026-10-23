package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	private WebDriver driver;
	
	By searchBox= By.xpath("//input[@id='twotabsearchtextbox']");
	By submit= By.xpath("//input[@id='nav-search-submit-button']");
	By add = By.xpath("//a//child::span[contains(text(),'iPhone 18 Pro (256 GB) - Black')]//ancestor::div[@role='listitem']//descendant::input[@aria-label='Add to cart']");
	By cart1=By.xpath("//a[@aria-label='1 item in cart']");
	By proceed = By.xpath("//input[@name='proceedToRetailCheckout']");
	public HomePage(WebDriver driver) {
        this.driver = driver;
    }

	
	public void search(String item) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(searchBox).sendKeys(item);
		driver.findElement(submit).click();
		JavascriptExecutor  js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
	}
	public void cart() {
		driver.findElement(add).click();
	}
	
	public void item() {
		System.out.print("Item added in the cart");
		driver.findElement(cart1).click();
		driver.findElement(proceed).click();
	}

}
