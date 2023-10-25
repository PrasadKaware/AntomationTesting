Feature: Verify the Order is placed 
Scenario: Verify the login page
Given user Already in Loginpage
Then get page title "SwagLabs"
When user type in Usernamefield
And user type passwordfield
And click on login button
When click on addTocart Product1
And click on addTocart product2
And click on the kart
When click on checkout
When give the inputName
And give the lastname
And the zipcode
And click on continue 
When click on the finish button
Then verify it contain msg "Thank you for your order!" 
And click on the back to home

 | 