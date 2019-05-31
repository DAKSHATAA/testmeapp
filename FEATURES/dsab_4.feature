Feature: The user wants to select product and proceed with checkout

  Scenario: Select Product and Checkout
    Given user login to TestMeApp
    When user selects product as "headphone"
    When user clicks on add to cart
    When user clicks on cart link
    When user provides quantity as 2
    When user proceed checkout
    Then verify the reiew and payment page