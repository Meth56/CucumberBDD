Feature: Payment Gateway functional test
#No matter what we always have to start with keyword. Otherwise the whole file will break
  @BuyingProduct_TC1 @Regression
  Scenario: Verify that user can buy an Elephant toy
    Given User wants to go to Payment Gateway Website
    When The user wants to buy an elephant toy
    Then The user wants to provide requested payment information
    And The user wants to click on pay now button
    Then The user wants to verify order is successful

  #First step is to go website
  #Second step is to choose quantity and click on buy now button
  #Third step we provided all required information
  #Fourth step we verified that order is success

  @BuyingProduct_TC2 @Regression @Smoke
  Scenario: Verify that user can buy multiple products
    Given User wants to go to Payment Gateway Website
    When The user wants to buy elephant toy as "5"
    Then The user wants to enter Credit Card Number as "5454545454545454"
    And The user wants to enter Expiration Month as "11"
    And The user wants to enter Expiration Year as "2026"
    And The user wants to enter CVV Code as "189"
    And The user wants to click on pay now button
    Then The user wants to verify message as "Payment successfull!"

    @dryRunTest @Regression
  Scenario: Verify that user can buy multiple products
    Given User wants to go to Payment Gateway Website
    When The user wants to buy elephant toy as "5"
    Then The user wants to enter Credit Card Number as "5454545454545454"
    And The user wants to enter Expiration Month as "11"
    And The user wants to enter Expiration Year as "2026"
    And The user wants to enter CVV Code as "189"
    And The user wants to click on pay now button
    Then The user wants to verify message as "Payment successfull!"


      @TC_400
  Scenario: Verify that user can buy multiple products - Using Map Format
    Given User wants to go to Payment Gateway Website
    When The user wants to buy elephant toy as
    |Quantity |5|
    Then The user wants to enter payment information as
      |CreditCard| 5141641651682341|
      |ExpirationMonth| 10         |
      |ExpirationYear | 2022       |
      |CvvCode        |193         |
    And The user wants to click on pay now button
    Then The user wants to verify message as "Payment successfull!"

