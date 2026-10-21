package SeleniumProject.SeleniumProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.Driver;

public class Base {

    

    @BeforeMethod
    public void setUp() {

     Driver.initDriver();

 
    
}}