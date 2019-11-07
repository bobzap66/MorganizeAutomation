Feature: Login

	Scenario: Login
		Given The user is on the login page
		When The user logs in
		Then The user should be on the user page
		
	Scenario: Create User
		Given The user is on the login page
		When The user clicks create user
		Then The user should be on the create user page