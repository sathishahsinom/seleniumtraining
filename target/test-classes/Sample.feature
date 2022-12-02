Feature: To validate the login fuctionality of facebook application

Background:
Given To launch the chromebrowser and maximise the window


Scenario: To validate login with valid username and invalid password
When To launch the url of the facebook application
And To pass the valid username in email field
And To pass the invalid password in password field
And To click the login button
And To check whether navigate to the home page or not 
Then To close the browser

Scenario Outline: To validate the positive and negative combinations of login functionality
And User has to hit the facebook url
And User has to pass the data "<emaildatas>" in email field
And User has to pass the data "<passworddatas>" in password field
And User has to click the login button 
Then User has to close the browser

Examples:
|emaildatas        |passworddatas|
|selenium@gmail.com|inmakes      |
|danny@gmail.com   |12345        |
|tony@gmail.com    |getsetgo     |
|maverick@gmail.com|675438       |
|xeno@gmail.com    |letsstart    |
|apitest@gmail.com |postman      |


