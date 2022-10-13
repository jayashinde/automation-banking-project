@Manager
Feature: login feature

  @SC01
  Scenario: login with valid details
    Given open url in the browser
    When enter "mngr446207" And "UpujUbe" And click on login
    Then login should be successful




