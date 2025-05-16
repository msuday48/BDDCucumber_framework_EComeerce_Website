Feature: Shopping Cart Functionality

  Scenario: Validating the visibility of products added to the cart
    Given the user navigates to the homepage, clicks on the login button with email "msuday48@gmail.com" and password "Uday@151997" and successfully logs in
    When the user navigates to the view cart page
    Then the same products added to the cart are displayed
    And the product price and checkout button are visible
