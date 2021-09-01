package pageFactory;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {

	WebDriver driver;
	
	@FindBy(id="email")
	WebElement  txt_email;
	
	@FindBy(id="password")
	WebElement  txt_password;
	
	@FindBy(xpath="//span[text()=\"Login\"]/parent::button")
	WebElement  btn_login;
	
	@FindBy(xpath="//h1[text()=\"Home\"]")
	WebElement  header_homepage;
	
	

	public LoginPage_PF(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	
	
	public void enterEmail(String email) {
		txt_email.sendKeys(email);
	}
	
	public void enterpassword(String password) {
		txt_password.sendKeys(password);
	}
	
	public void clickLoginBtn() {
		btn_login.click();
	}
	
	public void verifyUserLoggedIn() throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertTrue("User is not being able to login on giving valid credentials",header_homepage.isDisplayed());
	}



}
