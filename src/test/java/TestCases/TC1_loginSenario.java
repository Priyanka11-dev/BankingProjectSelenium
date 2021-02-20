package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.LoginPage;


public class TC1_loginSenario extends BaseClass{

	@Test
	public void TC1_Login() throws InterruptedException {
		driver.get(url);
		
		driver.manage().window().maximize();
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserid(userid);
		lp.setPswrd(pswrd);
		lp.clickLogin();
		
		Thread.sleep(5000);
		
		Assert.assertTrue(driver.getTitle().equals("Guru99 Bank Manager HomePage"));
	}
}
