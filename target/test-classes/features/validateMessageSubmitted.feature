Feature: Room Booking API Validation

  Scenario: Validate the submitted message for booking success
  
    Given I set the GET endpoint "https://automationintesting.online/message/1"
    
    When I send a GET HTTP request
    Then the GET response status code should be 200
   