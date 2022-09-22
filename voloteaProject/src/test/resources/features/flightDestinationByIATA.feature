Feature: Choosing flight destination by IATA code
  As a user
  I want to use IATA code
  To validate city search

  Background: Open browser and accept cookies
    Given user opens page and accept cookies
    When user clicks flight origin selector and enters the IATA code
      | bcn |

  Scenario: Choosing flight destination with IATA code
    And The system opens flight destination selector, enters the IATA code and clicks on the city
      | lil                 |
    Then The user should go to the outbound selector
