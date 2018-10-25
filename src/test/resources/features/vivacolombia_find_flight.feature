#Author:santiago_pipe@hotmail.com
@FindFlight
Feature: Viva Colombia Find Flight Functionality Feature
  In order to ensure Find Flight Functionality works,
  I want to run the cucumber test to verify it is working

  Background: 
    Given lukas open viva colombia homepage

  @SmokeTest
  Scenario Outline: Find Flight on Viva Colombia
    Given he selects one trip
    When he selects departure city
      | cityDeparture   |
      | <cityDeparture> |
    When he selects arrival city
      | cityArrival   |
      | <cityArrival> |
    And he picks <adults> Adults, <children> Children and <infants> infants
    When he selects the depart date
      | day | month | year |
      |  10 |    11 | 2018 |
    And he clicks on button find your flight
    When he choose a flight "4"
    Then he must to watch his flight "<cityDeparture>" to "<cityArrival>" on booking basket

    Examples: 
      | adults | children | infants | cityDeparture | cityArrival |
      |      2 |        3 |       1 | Bogota        | Cartagena   |
