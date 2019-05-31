Feature: Login with multiple set of test data

  Scenario Outline: Login
    Given user launching TestMeApp
    When user enter username as "<username>"
    And enter password is "<password>"
    Then click ok
    And verify login result
    
    Examples:
    |username|password|
    |lalitha|password123|
    |saranya|xyz|
    