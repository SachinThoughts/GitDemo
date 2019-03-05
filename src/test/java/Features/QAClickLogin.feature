Feature: QA Click Login

Scenario Outline: To verify QA Click login with set of credentials

Given I initialize the driver with chrome browser
And I navigate to <URL> site
And I click on login link to navigate to login page secure site
And I enter <Username> in Username box
And I enter <Password> in Password box
When I click on Login button
Then I should verify if its a successful login


Examples:
|URL								|Username					|Password	|
|http://www.qaclickacademy.com/		|sachin85_nair@yahoo.co.in  |123456		|
|http://www.qaclickacademy.com/		|test99@gmail.com			|1234		|
