Feature: Checking Date outbound selector
  As a user
  I want to check Date outbound selector
  To validate actual date

  Background: Open browser and accept cookies
    Given user opens page and accept cookies
    When user clicks flight origin selector and enters the IATA code
      | bcn |
    And The system opens flight destination selector, enters the IATA code and clicks on the city
      | lil                 |

    Scenario: Check date for today
      Then user should see the date for today