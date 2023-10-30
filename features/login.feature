Feature: Log In 

Scenario: 
Admin Login with correct email and password
		When admin enters email <"aya@example.com"> and password <"789"> 
		Then Show admin page and success message
Scenario: Admin login wrong email
	When admin enters email <"ahmad@example.com"> and password <"789"> 
	Then Show error message.
		
		Scenario: Admin login wrong password
	When admin enters email <"aya@example.com"> and password <"123"> 
	Then Show error message.
		
Scenario: customer Login with correct email and password 
	When customer enters email <"rama@example.com"> and password <"125"> 
Then Show customer page and success message 
	
	Scenario: customer Login with wrong email
	When customer enters email <"lara@example.com"> and password <"125"> 
Then  Show not correct email message
	Scenario: customer login wrong password
	When customer enters email <"rama@example.com"> and password <"258"> 
	Then Show error message.
		

Scenario: installer Login with correct email and password 
	When installer enters email <"rahaf@example.com"> and password <"564"> 
Then Show installer page and success message 
	
Scenario: installer Login with wrong email 
	When installer enters email <"loaa@example.com"> and password <"564"> 
Then  Show error message.

Scenario: installer login wrong password
	When installer enters email <"rahaf@example.com"> and password <"578"> 
	Then Show error message.
				













  
    