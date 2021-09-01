package pageFactory;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectPage_PF {

	WebDriver driver;
	
	@FindBy(xpath="(//button)[4]")
	WebElement  btn_project;
	
	@FindBy(xpath="//span[text()=\"new project\"]/parent::button")
	WebElement  btn_newProject;
	
	@FindBy(id="input-field-name")
	WebElement  fld_projectName;
	
	@FindBy(id="textarea-field-nameTextArea")
	WebElement  fld_projectDescription;
	
	@FindBy(xpath="//span[text()=\"Add\"]/parent::button")
	WebElement  btn_add;
	
	@FindBy(xpath="//span[contains(text(),\"Test Project\")]")
	WebElement  lst_project;
	
	

	public ProjectPage_PF(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	
	
	public void clickProject() {
		btn_project.click();
	}
	
	public void clickNewProject() {
		btn_newProject.click();
	}
	
	public void inputProjectName(String project_name) {
		fld_projectName.sendKeys(project_name);
	}
	
	public void inputProjectDescription(String project_description) {
		fld_projectDescription.sendKeys(project_description);
	}
	
	public void clickAddBtn() {
		btn_add.click();
	}
	
	public void verifyProjectAdded() throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertTrue("User is not being able to add new project",lst_project.isDisplayed());
		lst_project.click();
	}



}
