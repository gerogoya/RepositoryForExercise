package automationExcercise;

import static org.testng.Assert.assertEquals;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;


public class Excercise {
	
	//private WebDriver driver;
	
	@Test
	public void SearchAndOpenSeleniumhqPage(){
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "http://www.google.com";
		driver.get(url);
		WebElement GoogleInputSearch = driver.findElement(By.id("lst-ib"));
		GoogleInputSearch.sendKeys("seleniumhq");
		GoogleInputSearch.submit();
		String textTitlePage = "Selenium - Web Browser Automation";
		driver.findElement(By.linkText(textTitlePage)).click();
		String currentUrl = driver.getCurrentUrl();
		assertEquals(currentUrl, "http://www.seleniumhq.org/");
		driver.close();

	} 

	
}