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

public class GoogleHomePage extends ElementManager
{
	WebDriver driver;//test
	private static final By SEARCH_FIELD = By.name("q");
	private static final By SEARCH_BTN = By.name("btnK");
	
	Duration timeout = Duration.ofSeconds(30);
	
	public GoogleHomePage(WebDriver driver) {
		this.driver = driver;
	}
	public GoogleHomePage() {

	}	
	public void searchGoogle(String searchText) {
		
		enterText(driver, SEARCH_FIELD, searchText, timeout);
		clickElement(driver,SEARCH_BTN, timeout);
	}

	public void clickLink(String linkText) {
		clickElement(driver, By.xpath("//a[text()='" + linkText + "']"), timeout);
	}

	
}
