Feature: New login

  
  Scenario: User login validation
  
  
    Given User navigate to home page
    When User clicks on sign_in link
    And User input email address and password
    And User clicks on sign_in button
    Then User is on account page
    #And New feature validation
    
    # Steps key words
    
       #Given, When, And, But, Then
    

