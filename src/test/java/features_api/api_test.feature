#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: Api testing using the Eragst developer API
@api
Feature: Ergast developer API
  I want to use this feature file to explain the rest api testing using rest assured and cucumber

  Scenario Outline: Check the number of circuit records
    Given I have the "<baseUrl>" and "<endPoint>"
    When i make a call to the REST API GET request
    Then the HTTP status code from the response should be "<statusCode>"
    And the circuit numbers is equal to "<circuitNo>"

    Examples: 
      | baseUrl   | endPoint     | statusCode | circuitNo |
      | ergastDev | 2017circuits |        200 |        20 |
