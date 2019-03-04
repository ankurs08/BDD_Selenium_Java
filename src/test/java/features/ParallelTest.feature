Feature: Parallel automation of the practice website

  @json
  Scenario: Read json - automate the practice website
    Given I launch the test automation website
    When I navigate to the forgot password page
    And I send email from the json