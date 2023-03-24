Feature: Submit Student Registration Form successfully

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
    And user fills '<Mobile Number>' 'Mobile(10 Digits)' field with 'valid' data
    And user click on 'Submit' button
    Then user successfully submitted the form and a pop-up "Thanks for submitting the form" with following data is displayed
      | Student Name             |  Gender  | Mobile          |
      | <First Name> <Last Name> | <gender> | <Mobile Number> |

    Examples:
      | First Name | Last Name | gender | Mobile Number |
      | Adam       | Smith     | Male   | 0691234567    |
      | Michelle   | Sanders   | Female | 1234567899    |
      | Alex       | Robinson  | Other  | 9987654321    |