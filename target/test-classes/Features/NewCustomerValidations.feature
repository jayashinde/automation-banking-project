@NC
Feature: New Customer Validations
Background:
  Given open url in the browser
  When enter "mngr446207" And "UpujUbe" And click on login

 @SC01
 Scenario: create new customer
   Given click on new customer  And enter "jay" And click on gender
   And Enter "9-10-2022" And enter address "pune" And city "latur"
   And Enter state "maharashtra" And pin "412586" and telephone "548655846"
   And Enter email "jayestingmn@gmail.com" And click on submit
   And click on ok
   Then login should be sucessful message should be display
#
#  @SC01
#  Scenario: create new customer
#    And Enter "9-10-2022" And enter address "pune" And city "latur"
#    And Enter state "maharashtra" And pin "412586" and telephone "548655846"
#    And Enter email "testtestingmn@gmail.com" And click on submit
#    And click on ok




