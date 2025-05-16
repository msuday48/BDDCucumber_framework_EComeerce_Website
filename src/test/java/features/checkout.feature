Feature: Validating the checkout functionality

  Scenario: User completes checkout process successfully

    Given  User logs in and navigates checkout page with "msuday48@gmail.com" and "Uday@151997"
    And  user navigates to checkout page and validates product name price and clicks on checkout button
    When User enters first name as "Uday" and last name as "Kumar"
    And User enters address1 "Bangalore BTM Layout 2nd Stage" and city "Bangalore"
    And User selects Country as "India"
    And User selects State as "Karnataka"
    And User clicks on continue Billing Address Delivery Address Delivery Method and shipping address
    And User agrees to terms and conditions and clicks on continue for Payment Method
    Then Total price should be displayed
    When User clicks on Confirm Order
    Then Order should be placed successfully
