package framework;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import com.github.jsdevel.testng.selenium.TestNGSeleniumLogger;


public class ElementManager{
		
	private WebDriverWait wait;
	private WebElement element;
	private Actions actionbuilder;
	
	  public void clickElement(WebDriver driver, By byType, Duration explicitwait) {
		  if (driver== null)
			  Logger.getLogger(new Exception().getStackTrace()[1].getClassName()).info("NULL DRIVER");

		  wait = new WebDriverWait(driver, explicitwait);
		  if (wait.until(ExpectedConditions.elementToBeClickable(byType)) != null)
		  {
			  element = driver.findElement(byType);
			  String Value = element.getText();
			  if (element.isDisplayed() && element.isEnabled()) {
				  ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
				  if (Value == null || Value.isEmpty()) {
					  Logger.getLogger(new Exception().getStackTrace()[1].getClassName()).info("WebElement = " + byType + " - is identified and clicked");
				  }else {
					  Logger.getLogger(new Exception().getStackTrace()[1].getClassName()).info("WebElement = " + Value + " - is identified and clicked");
				  }
			  }
			  
		  }
	  }
	  
	  public void enterText(WebDriver driver,By byType, String text, Duration explicitwait) {
		  wait = new WebDriverWait(driver, explicitwait);
		  if (wait.until(ExpectedConditions.elementToBeClickable(byType)) != null)
		  {
			  element = driver.findElement(byType);
			  String Value = element.getText();
			  if (element.isDisplayed() && element.isEnabled()) {
				  element.clear();
				  element.sendKeys(text);
				  if (element.getText() != null)
					 Logger.getLogger(new Exception().getStackTrace()[1].getClassName()).info("Entered text = " + text + " in WebElement = " + byType);
			  }
			  
		  }
	  }
	  
	  public String getText(WebDriver driver,By byType, Duration explicitwait) {
		  String returnText = "";
		  wait = new WebDriverWait(driver, explicitwait);
		  try {
			  if (wait.until(ExpectedConditions.elementToBeClickable(byType)) != null)
			  {
				  element = driver.findElement(byType);
				  returnText = element.getText();
			  }
			  
		  }catch(Exception e) {
			  Logger.getLogger(new Exception().getStackTrace()[1].getClassName()).info("TIMEOUT element does not exist byType = " + byType);
			  Assert.fail("Timeout Exception getting element text  byType = " + byType);
		  }  
		  return returnText;
	  }
	
}
