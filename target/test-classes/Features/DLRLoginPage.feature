Feature: DLR Certify Login Page

@RegressionTests
Scenario Outline: To verify DLR Certify login with set of credentials

Given I initialize the driver with chrome browser
And I navigate to <URL> site
And I enter <Username> in Username field
And I enter <Password> in Password field
When I click on Go button
Then I should verify if its a successful DLR login


Examples:
|URL								|Username					|Password	    |
|https://demo.dlrcertify.com/ae 	|isadmin                    |T@x5t@mp5!!	|
|https://demo.dlrcertify.com/ae		|test99@gmail.com			|1234		    |

