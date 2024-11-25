Feature: Automation Rest Api

  @Api @positive
  Scenario: get all user with valid url
    Given prepare url valid for "GET_LIST_USERS"
    When hit url to get list data
    Then validation get status code 200
    And Validation response body list users
    And validation response json with JSONSchema "get_list_users_normal.json"

  @Api @negative
  Scenario: get all user with invalid url
    Given prepare url valid for "GET_LIST_USERS_INVALID"
    When hit url to get list data
    Then validation get status code 404

  @Api @positive
  Scenario: create new user with valid data
    Given prepare url valid for "CREATE_USERS"
    When hit url to create new user
    Then validation get status code 201
    And Validation response body new users

  @Api @negative
  Scenario: create new user with empty name
    Given prepare url valid for "CREATE_USERS"
    When hit url to create new user with empty data
    Then validation get status code 422

  @Api @positive
  Scenario: delete user with valid id
    Given prepare url valid for "CREATE_USERS"
    When hit url to create new user
    And validation get status code 201
    And Validation response body new users
    And hit api delete user
    Then validation get status code 204

  @Api @positive
  Scenario: Update user with valid id
    Given prepare url valid for "CREATE_USERS"
    When hit url to create new user
    And validation get status code 201
    And Validation response body new users
    And hit api update user
    Then validation get status code 200
    And Validation response body update users
