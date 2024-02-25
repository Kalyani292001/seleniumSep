   
Feature: Login

Scenario:Validate the login functionality with valid credentials

Given Open the Orangehrm demo URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
Then Fill the "Admin"
Then Fill the "admin123"
Then Click on login button
When Validate the sucessfull msg