package framework;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import com.github.jsdevel.testng.selenium.TestNGSeleniumLogger;


public class DriverManager {
		
	private WebDriverWait wait;
	private WebElement element;
	//protected static 
	private Actions actionbuilder;
	public static String mainWindow1;
	
	public DriverManager() {

		
	}
	
	public static WebDriver testSetup(String browser, String url) {
		  System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		  ChromeOptions options = new ChromeOptions();
		  WebDriver driver = new ChromeDriver(options);
		  driver.get(url);
		  driver.manage().window().maximize();
		  return driver;
	  }
	
}
