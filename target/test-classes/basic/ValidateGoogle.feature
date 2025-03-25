Feature: Google website validation

Scenario: 1.Verify if google is up
	Given Prepare URL "https://www.google.com/"
	When hit site
	Then Check valid status 200 ok
	
Scenario: 2.Verify if google is up
	Given Prepare URL "https://www.google.com/"
	When hit site
	Then Check valid status 300 ok
	
Scenario: 3.Verify if Amazon is up
	Given Prepare URL "https://www.amazon.in/"
	When hit site
	Then Check valid status 200 ok
	
Scenario: 4.Verify if Amazon is up
	Given Prepare URL "https://www.amazon.in/"
	When hit site
	Then Check valid status 300 ok