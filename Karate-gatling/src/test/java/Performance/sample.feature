Feature:  Demo test

  @Demo
  Scenario: Sample Api to be tested
    Given url sampleTestUrl
    When method GET
    Then status 200
    And print response
    And match $.page == '#present'



