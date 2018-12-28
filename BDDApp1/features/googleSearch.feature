 
  Feature: Google Search Feature
Using this feature user can able to search very vital information

Scenario: User want to search information on 'Agile Methodology' by entering valid set of w
Given User is on Google HomePage
When User search for 'Agile Methodology'
Then All links should display with 'Agile Methodology'