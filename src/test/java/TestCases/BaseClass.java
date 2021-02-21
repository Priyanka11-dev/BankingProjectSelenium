package TestCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readConfig=new ReadConfig();
	public String userid=readConfig.getUserid();
	public String pswrd=readConfig.getPswrd();
	public String url=readConfig.getURL();
	public static WebDriver driver;
	public Logger logger; 
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", readConfig.getChromepath());
		driver=new ChromeDriver();
		
		logger=Logger.getLogger("SeleniumJava");
		PropertyConfigurator.configure("log4j.properties");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	
}
