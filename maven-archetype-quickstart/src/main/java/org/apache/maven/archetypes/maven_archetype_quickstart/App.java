package org.apache.maven.archetypes.maven_archetype_quickstart;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		 
		 
		 //System.setProperty("webdriver.chrome.driver","/home/edureka/chromedriver");
		 System.setProperty("webdriver.gecko.driver","/home/edureka/geckodriver");
		//ChromeOptions chromeOptions = new ChromeOptions();
		 FirefoxOptions options = new FirefoxOptions();
		 options.addArguments("--headless");
		 WebDriver driver = new FirefoxDriver(options);
		// WebDriver driver = new ChromeDriver(chromeOptions);
		
		 //System.setProperty("webdriver.firefox.driver","/home/edureka/geckodriver");
		 		 //ChromeOptions chromeOptions = new ChromeOptions();
		// FirefoxOptions options = new FirefoxOptions();
		 //WebDriver driver = new FirefoxDriver(options);
	 System.out.println("Hi, Welcome to Edureka's YouTube Live session on Selenium WebDriver");
		 
		 
		 //driver.get("http://localhost:8090/addressbook");
	    driver.get("http://localhost:3001/");
	 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.name("login")).sendKeys("admin");
		 driver.findElement(By.name("password")).sendKeys("admin");
		 driver.findElement(By.name("click")).click();
			/*
			 * //driver.findElement(By.className("v-button")).click();
			 * driver.findElement(By.id("gwt-uid-5")).sendKeys("Edureka");
			 * driver.findElement(By.id("gwt-uid-7")).sendKeys("DevOps");
			 * driver.findElement(By.id("gwt-uid-9")).sendKeys("9834562709");
			 * driver.findElement(By.id("gwt-uid-11")).sendKeys("Devops@edureka.co");
			 * driver.findElement(By.id("gwt-uid-13")).sendKeys("01/01/2015");
			 * driver.findElement(By.className("v-button-primary")).click();
			 */
		 //Thread.sleep(5000);
		 driver.quit();
    }
}
