package FirstTest.TrevTestNG.pages;

import com.github.jsdevel.testng.selenium.AbstractPage;

import framework.DriverManager;
import framework.ElementManager;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.*;

public class GoogleSearchResultsPage extends ElementManager
{
	private static final By IMAGES_LINK = By.xpath("//a[text()='Images']");
	private static final By NEWS_LINK = By.xpath("//a[text()='News']");
	Duration timeout = Duration.ofSeconds(30);
	WebDriver driver;
	
	public GoogleSearchResultsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void viewNews() {
		
		clickElement(driver,NEWS_LINK, timeout);
	}
	public void viewImages() {
		clickElement(driver,IMAGES_LINK, timeout);
	}
  
}