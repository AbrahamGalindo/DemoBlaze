Feature: BuyProduct
  Background:
    Given Execute before scenario

  @buyProduct @all
  Scenario Outline: Complete the buy product
    Given Sign up o the application "<userName>" "<password>"
    And Login on the application "<password>"
    And Select product "<product>"
    When Add to cart the product
    Then Validate the product was added "<product>"
    And Pay the product "<name>" "<country>" "<city>" "<creditCard>" "<month>" "<year>"
    Then Validate the product was paid
    Then Execute after scenario


    Examples:
      | userName | password    | product           | name    | country | city   | creditCard          | month | year |
      | ABrahAM  | Password123 | Samsung galaxy s6 | Abraham | Mexico  | Puebla | 4111-1111-1111-1111 | 12    | 26   |


  @addProductAndDelete @all
  Scenario Outline: Add new product and delete
    Given Sign up o the application "<userName>" "<password>"
    And Login on the application "<password>"
    And Select product "<product>"
    When Add to cart the product
    Then Validate the product was added "<product>"
    And Delete the product added
    Then Validate the product was deleted "<product>"
    Then Execute after scenario


    Examples:
      | userName | password    | product          |
      | ABrahAM  | Password123 | Nokia lumia 1520 |
