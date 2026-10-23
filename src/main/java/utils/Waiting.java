package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiting {
	WebDriver driver;
	
	
	public Waiting(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void time() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		
	}

}
