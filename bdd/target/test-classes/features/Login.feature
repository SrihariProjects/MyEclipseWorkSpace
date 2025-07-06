Feature: Login to OrangeHRM

Background: 
Given User launches the browser

Scenario Outline: Login with valid credentials 
When user enters username "<username>" and password "<password">
Then User should be logged in successfully

Examples:
| username | password |
| Admin    | admin123 |