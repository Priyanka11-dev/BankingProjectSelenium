package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="uid")
	@CacheLookup
	WebElement txt_userid;

	@FindBy(name="password")
	@CacheLookup
	WebElement txt_password;

	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement btn_login;

	public void setUserid(String userid) {
		txt_userid.clear();
		txt_userid.sendKeys(userid);
	}

	public void setPswrd(String pswrd) {
		txt_password.clear();
		txt_password.sendKeys(pswrd);
	}

	public void clickLogin() {
		btn_login.click();
	}

}
