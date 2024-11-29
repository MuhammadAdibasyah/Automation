@web
Feature: login


  Scenario: login with valid username and valid password
    Given user on login page
    When user fill username with "standard_user"
    And user fill password with "secret_sauce"
    And user click login button
    Then user success to login and on home page

  Scenario: login with valid username and invalid password
    Given user on login page
    When user fill username with "standard_user"
    And user fill password with "secret123"
    And user click login button
    Then user get error message "Username and password do not match any user in this service"

  Scenario: login with invalid username and valid password
    Given user on login page
    When user fill username with "locked_out_user"
    And user fill password with "secret_sauce"
    And user click login button
    Then user get error message "Sorry, this user has been locked out"
