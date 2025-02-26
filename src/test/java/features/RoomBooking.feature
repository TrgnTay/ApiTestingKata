Feature: Room Booking API Testing

Scenario: Create a new booking

Given I set the Post endpoint "https://automationintesting.online/message/"

    When I send a POST HTTP request 
    Then the response status code should be 201
    And the response body should contain "messageid"

