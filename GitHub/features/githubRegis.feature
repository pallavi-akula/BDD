Feature: Github signUp functionality Check

 Scenario: User is trying to signUp in GitHub using username and password
 
Given User is on GitHub signUp Page
When  User enter username and password less than 8 characters
Then  ' atleast 8 characters are required' message should display

 Scenario: User is trying to signUp in GitHub using username and password
 
Given User is on GitHub signUp Page
When  User enter valid username and password 
Then  user should succesfully create his GitHub account

Scenario: User is trying to signUp in GitHub using Information


Given User is on GitHub signUp Page
When  User enter Invalid mailId
Then  ' Invalid Email Id' Message should display

Scenario: User is trying to signUp in GitHub using valid mailId

Given User is on GitHub signUp Page
When  User enter valid mailId
Then  user should succesfully create his GitHub account
