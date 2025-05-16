Feature: Validating the Product Page Functionality

  @regression @sanity
  Scenario Outline: Successfully search for a product and add it to the cart
    Given the user navigates to the homepage, clicks on the My Account page, and successfully logs "<email>" "<password>" in
    When the user clicks on the search bar, enters the product name "<product>" and clicks on the search icon
    And the searched product "<product>" is displayed
    Then the user enters the quantity "<qty>" of the product and clicks on the Add to Cart button

    Examples:
      | email               | password     | product | qty |
      | msuday48@gmail.com | Uday@151997  | MacBook | 3   |
