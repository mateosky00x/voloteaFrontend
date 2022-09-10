Feature: Selecting adult passengers

  As a user
  I want to select the quantity of adult passengers
  To buy a flight ticket

  Scenario Outline: Selecting a valid adult
  passengers quantity for a flight
    Given user opens page and accept cookies
    When user clicks on passengers and add '<adults>'
    Then the user will see the number of adult passengers selected '<expected>'
    Examples:
      | adults | expected |
      | 2      | 2        |
      | 9      | 9        |

