Feature: Purchase product from TestMeApp
@category
  Scenario: search product by category
    Given user login
    When user selects product using category
    Then verify the list of products
    And close application
@sub-category
  Scenario: search product by category
    Given user login
    When user selects product using sub-category
    Then verify the list of products
    And close application
@productname
  Scenario: search product by category
    Given user login
    When user selects product using product name
    Then verify the list of products
    And close application 
    
