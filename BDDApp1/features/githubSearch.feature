Feature: GitHub Search Feature
Scenario: User is trying to signin in gitHub using correct username and password

Given User is on GitHub LoginPage
When User enter Correct username and password
Then user should successfully Signin on his Github Account


Scenario:User is trying to signin in gitHub using wrong username and password

Given User is on GitHub LoginPage
When User enter wrong username and password
Then 'InCorrect username and password' Message should display

Scenario:User is trying to signin in gitHub using correct username and wrong password

Given User is on GitHub LoginPage
When User enter correct username and wrong password
Then 'Correct username with wrong password' Message should display


