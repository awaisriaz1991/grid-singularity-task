Feature: feature to test D3a

  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When user enteres email and password
    And clicks on login button
    Then user is navigated to the home page
    
    
  Scenario: Check project is being created successfully  
		Given user clicks on project from side nav
		When user click on new project
		And user enter project name
		And user enter project description
		And user clicks add button
		Then user verifies if newly added project is listed

		
	Scenario: Check simmulation is being created successfully  
		Given user clicks on new simmulation button
		When user click on next button
		Then user verifies if newly added simmulation is listed