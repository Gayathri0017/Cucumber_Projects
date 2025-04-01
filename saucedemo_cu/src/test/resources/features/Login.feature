@LoginPagee
Feature: Login Feature
  @validCredentials
  Scenario: Login Feature with valid credentials
    Given I am in the SauceDemo Login Page
    When User provides the valid User name
    And User provides the valid password
    And User clicks the login button
    Then I should see a dashboard
    And Close the application
    
  @InvalidCredentials
  Scenario: Login Feature with Invalid credentials
    Given I am in the SauceDemo Login Page
    When User does not provides the User name
    And User provides the valid password
    And User clicks the login button
    Then I should see the error message
    And Close the application
    
  @InvalidCredentials
  Scenario: Login Feature with Invalid credentials
    Given I am in the SauceDemo Login Page
    When User provides the valid User name
    And User does not provide the password
    And User clicks the login button
    Then I should see the error messagee
    And Close the application
    
  @InvalidCredentials
  Scenario: Login Feature with Invalid credentials
    Given I am in the SauceDemo Login Page
    When User provides Invalid User name
    And User provides Invalid password
    And User clicks the login button
    Then I should see the error messagee3
    And Close the application
    
  
