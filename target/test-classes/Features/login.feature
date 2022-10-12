@Manager
Feature: login feature
  @SC01
  Scenario: login with valid details

    Given Open url in the browser
    When Enter "mngr446207" And  "UpujUbe" And click on login
    And click on new customer
    And enter "mahi" And click on gender
    And Enter "9-10-2022" And enter address "pune" And city "latur"
    And Enter state "maharashtra" And pin "412586" and telephone "548655846"
    And Enter email "testtestingmn@gmail.com" And click on submit
    And click on ok
    And click on edit customer And enter "91005"
    And enter "mumbai" and click on submit
    And  click on delete button
    And Enter "91005" And click on submmit
    And click on newaccount And enter "91005"
    Then login should be successful





