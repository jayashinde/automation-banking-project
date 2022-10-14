@Manager
Feature: login feature

  @SC01
  Scenario: Manager should be login with valid details
    Given open url in the browser
    When enter "mngr446207" And "UpujUbe" And click on login
    Then login should be successful

    @SC02
    Scenario:  Manager should be login with Invalid details
      Given open url in the browser
      When enter userid And do not enter password And click on login
      Then error message should be displayed

  @SC03
  Scenario: Manager should be login with Invalid details
    Given open url in the browser
    When  do not userid And enter password And click on login
    Then error message should be display

  @SC04
  Scenario: Manager should be login with Invalid details
    Given open url in the browser
    When  do not userid And do not enter password And click on login
    Then error message should be show






