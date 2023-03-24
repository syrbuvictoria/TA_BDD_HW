Feature: Submit Student Registration Form unsuccessfully

  Background:
    Given user is on 'Main' page
    When user selects 'Forms' menu option
    And user navigates to 'Practice Form' page
    Then 'Student Registration Form' is displayed


  @RunTest
  Scenario Outline: Submit new Student Registration Form with valid credentials
    When user provides following data
      | First Name        | <First Name>    |
      | Last Name         | <Last Name>     |
      | Gender            | <gender>        |
    And user fills '<Mobile Number>' 'Mobile(10 Digits)' field with 'invalid' data
    And user click on 'Submit' button
    Then user unsuccessfully submitted the form and nothing is displayed

    Examples:
      | First Name | Last Name | gender | Mobile Number |
      | Adam       | Smith     | Male   | 1             |
      | Michelle   | Sanders   | Female | +123456789    |
      | Alex       | Robinson  | Other  |               |