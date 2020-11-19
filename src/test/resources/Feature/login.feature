@tag
Feature: Validate logn screen
Scenario: Successful login with Valid data
Given application launched already
When correct credentials are provided
And click on login button
Then successfully logged in to application
