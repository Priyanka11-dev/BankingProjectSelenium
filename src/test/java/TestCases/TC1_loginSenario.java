package TestCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.LoginPage;


public class TC1_loginSenario extends BaseClass{

	@Test
	public void TC1_Login() throws InterruptedException {
		driver.get(url);
		logger.info("url is opened");
		
		driver.manage().window().maximize();
		logger.info("page is maximized");
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserid(userid);
		logger.info("userid entered");
		
		lp.setPswrd(pswrd);
		logger.info("password entered");
		
		lp.clickLogin();
		logger.info("login button clicked");
		
		Thread.sleep(5000);
		
		Assert.assertTrue(driver.getTitle().equals("Guru99 Bank Manager HomePage"));
		logger.info("Assertion applied");
		
	}
}
