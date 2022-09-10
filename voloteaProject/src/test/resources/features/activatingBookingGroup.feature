Feature: activating booking group option

  As a user
  I want to select the quantity of adult passengers
  To activate the booking group option

  Background: Open browser and accept cookies
    Given user opens page and accept cookies

  Scenario Outline: Selecting a valid adult
  passengers quantity for a flight
    When user clicks on passengers and add '<adults>'
    Then the user will see the number of adult passengers selected '<expected>' and the booking group enabled '<booking group>'
    Examples:
      | adults | expected | booking group       |
      | 10     | 10       | "Reservas de grupos" |
      | 25     | 25       | "Reservas de grupos" |
