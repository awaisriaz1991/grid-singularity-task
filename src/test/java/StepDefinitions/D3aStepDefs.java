package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.LoginPage_PF;
import pageFactory.ProjectPage_PF;
import pageFactory.SimmulationPage_PF;

public class D3aStepDefs {

	public static WebDriver driver;
	LoginPage_PF login;
	ProjectPage_PF project;
	SimmulationPage_PF simmulation;
	
	@Given("user is on login page")
	public void user_on_login_page() {
	  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/drivers/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.d3a.io/login");
	}


	@When("user enteres email and password")
	public void user_enters_email_password() throws InterruptedException {
	  login=new LoginPage_PF(driver); 
	  Thread.sleep(5000);
	  login.enterEmail("zarrar1991@hotmail.com");
	  login.enterpassword("Unwritten1\"\"");
	}

	
	@And("clicks on login button")
	public void clicks_login_btn() {
		login.clickLoginBtn();
	   
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_home_page() throws InterruptedException {
	   login.verifyUserLoggedIn();
	}
	
	@Given("user clicks on project from side nav")
	public void click_project_side_nav() {
		project=new ProjectPage_PF(driver);
		project.clickProject();
		
		
	}


	@When("user click on new project")
	public void user_clicks_new_project() throws InterruptedException {
	   project.clickNewProject();
	  
	}

	
	@And("user enter project name")
	public void user_enters_project_name() {
		project.inputProjectName("Test Project");
	   
	}
	
	@And("user enter project description")
	public void user_enters_project_description() {
		project.inputProjectDescription("Test Project");
	   
	}
	
	@And("user clicks add button")
	public void user_clicks_add_btn() {
		project.clickAddBtn();
	   
	}

	
	@Then("user verifies if newly added project is listed")
	public void user_verifies_if_new_project_listed() throws InterruptedException {
		project.verifyProjectAdded();
		
	   
	}
	

	
	@Given("user clicks on new simmulation button")
	public void click_new_simmulation_btn() {
		simmulation=new SimmulationPage_PF(driver);
		simmulation.clickNewSimulationBtn();
		
		
	}
	
	@When("user click on next button")
	public void user_clicks_next_btn() throws InterruptedException {
	    Thread.sleep(2000);
		simmulation.clickNextBtn();
	  
	}
	
	@Then("user verifies if newly added simmulation is listed")
	public void user_verifies_if_new_simmulation_listed() throws InterruptedException {
		project.clickProject();
		simmulation.verifySimulationAdded();
		
		
	   
	}
}
