package pageFactory;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SimmulationPage_PF {

	WebDriver driver;
	
	@FindBy(xpath="//span[text()=\"new simulation\"]/parent::button")
	WebElement  btn_newSimmulation;
	
	
	@FindBy(xpath="//span[text()=\"Next\"]/parent::button")
	WebElement  btn_next;
	
	@FindBy(xpath="//p[text()=\"default simulation\"]")
	WebElement  lst_simulation;
	
	

	public SimmulationPage_PF(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	
	
	public void clickNewSimulationBtn() {
		btn_newSimmulation.click();
	}
	
	public void clickNextBtn() {
		btn_next.click();
	}
	
	
	
	public void verifySimulationAdded() throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertTrue("User is not being able to add new simulation",lst_simulation.isDisplayed());
	}



}
