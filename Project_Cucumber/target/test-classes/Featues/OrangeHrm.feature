Feature: Test OrangeHRM to create and delete employee details

Background:
  Given user is already on the OrangeHRM Login page
  When user enters the username
  And user enters the password
  And user clicks on the login button
  And user clicks on the PIM (Personnel Information Management) menu

Scenario: Verify the Addition of an Employee
  When user clicks on Add Employee
  And user inputs the Firstname
  And user Middlename
  And user Last Name
  And user fills in the Employee ID
  And user clicks on Save
  And Add license expire date
  And click on Nation
  And Add the Nationality
  And Click ON Date Of Birth
  And Click On Status drop down
  And Click On Martial_status
  And select the gender
  And save the information