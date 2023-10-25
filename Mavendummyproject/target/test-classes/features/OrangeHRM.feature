Feature: User is able to Add employee details and delete it
Background:
Given user Already in login page
When user input valid username
When user input valid password
When user click on the login button 
When click on the pim  


Scenario: verify the Employe Id is created
When user click on the Add Employe
When user click on the Add Employe
When user fill the firstname,middle name,last name and emplyoeid ,saveit
And user is filled License date
And clicked on the nation
And user is selected the nation
And user click on the status
And user selected the status
And user is given the date of birth
And user is selcted the gender
And user is saved the details
And close it

Scenario: Delete created EmployeID
When user is type in employeid field
And click on the search button
And click on the check box 
And click on the delete
And given confrimation for delete
And click on the profile
And click on the logout

