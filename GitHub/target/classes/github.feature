Feature: GitHub Feature
Using this feature user can search very vital information

Scenario: User want to open his 'GitHub.com' by entering Invalid Username and Password 
Given User is on GitHub LoginPage
When User enteres Invalid Username and invalid passsword
Then display'invalid User'

Scenario: User want to open his 'GitHub.com' by entering Valid Username and Password 
Given User is on GitHub LoginPage
When User enteres Valid Username and Valid passsword
Then open github 

Scenario: User want to open his 'GitHub.com' by entering Invalid Username and  valid Password 
Given User is on GitHub LoginPage
When User enteres Invalid Username and valid passsword
Then display'invalid User'

Scenario: User want to open his 'GitHub.com' by entering valid Username and Invalid Password 
Given User is on GitHub LoginPage
When User enteres valid Username and invalid passsword
Then display'invalid User'