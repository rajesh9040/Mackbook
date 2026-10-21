package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {
	
	private static WebDriver driver;
	
	public static void initDriver() {
		   WebDriverManager.chromedriver().setup();

	        driver = new ChromeDriver();

	        driver.manage().window().maximize();

	        driver.get("https://www.amazon.in/");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    }
	public static WebDriver getDriver() {
		return driver;
	}
	}


