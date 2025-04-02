@LoginPagee
Feature: Login Feature
  @validCredentials
  Scenario: Login Feature with valid credentials
    When User provides the valid User name
    And User provides the valid password
    And User clicks the login button
    Then I should see a dashboard
    
  @InvalidCredentials
  Scenario: Login Feature with Invalid credentials
    When User does not provides the User name
    And User provides the valid password
    And User clicks the login button
    Then I should see the error message
    
  @InvalidCredentials
  Scenario: Login Feature with Invalid credentials
    When User provides the valid User name
    And User does not provide the password
    And User clicks the login button
    Then I should see the error messagee
    
  @InvalidCredentials
  Scenario: Login Feature with Invalid credentials
    When User provides Invalid User name
    And User provides Invalid password
    And User clicks the login button
    Then I should see the error messagee3
    
  
