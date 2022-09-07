package FirstTest.TrevTestNG.suites;

import com.github.jsdevel.testng.selenium.AbstractSuite;

import com.github.jsdevel.testng.selenium.annotations.driverconfig.UserAgent;
import com.github.jsdevel.testng.selenium.annotations.screensizes.LargeDesktop;
import com.github.jsdevel.testng.selenium.annotations.screensizes.Phone;
import com.github.jsdevel.testng.selenium.config.Config;
import com.github.jsdevel.testng.selenium.exceptions.PageInitializationException;
import com.github.jsdevel.testng.selenium.exceptions.PageInstantiationException;
import FirstTest.TrevTestNG.pages.GoogleSearchResultsPage;
import framework.DriverManager;
import framework.ElementManager;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import FirstTest.TrevTestNG.pages.GoogleHomePage;



public class SampleSuiteITest {
	GoogleHomePage googlehome;
	
	
	  @Test
	  public void we_should_be_able_to_view_google1() {
		  WebDriver driver =  DriverManager.testSetup("Chrome","https:\\www.google.com");
		  GoogleHomePage googlehome = new GoogleHomePage(driver);		  
		  String className = new Exception().getStackTrace()[1].getClassName();
		  Logger log = Logger.getLogger(className);
		  log.info("blahhhh");
		  System.out.println("Before view url");
		  googlehome.searchGoogle("Testing1");
		  System.out.println("After view url");
		  GoogleSearchResultsPage searchResults = new GoogleSearchResultsPage(driver);
		  searchResults.viewNews();
		  
		  
	  }
	  
	  @Test
	  public void we_should_be_able_to_view_google2() {
		  WebDriver driver =  DriverManager.testSetup("Chrome","https:\\www.google.com");
		  GoogleHomePage googlehome = new GoogleHomePage(driver);
		  System.out.println("Before view url");
		  googlehome.searchGoogle("Testing2");
		  System.out.println("After view url");
		  GoogleSearchResultsPage searchResults = new GoogleSearchResultsPage(driver);
		  searchResults.viewImages();
		  
	  }
}