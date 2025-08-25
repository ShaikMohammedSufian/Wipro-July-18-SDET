Feature: Registration Form functionality

  Scenario: Successful registration with valid details
    Given the user is on the Practice Registration Form page
    When the user enters name "Sufian"
    And the user enters email "shaik@gmail.com"
    And the user selects gender "Male"
    And the user enters mobile number "1234567890"
    And the user enters date of birth "2002-04-11"
    And the user enters subjects "java selenium, python, software testing"
    And the user selects hobby "Reading"
    And the user uploads a picture "D:/vs code/New folder/20031.jpg"
    And the user enters address "Kurnool, Andhra Pradesh"
    And the user selects state "NCR"
    And the user selects city "Agra"
    And the user clicks on the login button
    Then the registration should be submitted successfully
