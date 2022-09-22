Feature: Chosing flight origin by IATA code
  As a user
  I want to use IATA code
  To validate city search

  Background: Open browser and accept cookies
    Given user opens page and accept cookies

  Scenario: Login with valid IATA code
    When user clicks flight origin selector and enters the IATA code
      | bcn    |
    Then The user should see the flight city destinations desde Barcelona
