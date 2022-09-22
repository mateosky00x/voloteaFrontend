Feature: erasing origin destination
  As a user
  I want to use IATA code
  To validate city search

  Background: Open browser and accept cookies
    Given user opens page and accept cookies
    When user clicks flight origin selector and enters the IATA code
      | bcn |
    And The system opens flight destination selector, enters the IATA code and clicks on the city
      | lil |

  Scenario: Choosing flight destination after selecting it
    And User goes back to erase the city origin
      |  |
    Then The city destination will be erased automatically as well

