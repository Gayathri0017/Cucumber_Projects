@Login
Feature: Swag Labs Login Functionality
  I want to login to the Swag Labs website

  @chrome @ValidCredentials
  Scenario Outline: Valid and Invalid Login
    When I enter "<username>" as usernamee
    And I enter "<password>" as passwordd
    And I click on the login buttonn
    Then I should "<outcome>"

    Examples:
      | username        | password      | outcome                                  |
      | standard_user  | secret_sauce   | be redirected to the products pageee       |
      |                | secret_sauce   | see an error messageee                     |
      | standard_user  |                | see an error message in password fielddds   |
      | standard       | 1234           | see an error message in both fieldsd      |