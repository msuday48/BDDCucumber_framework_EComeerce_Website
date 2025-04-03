Feature: Product Search Functionality on Homepage

  @regression
  Scenario Outline: Validating the search functionality with valid product names
    Given the user navigates to the login page
    And User enters valid email as "msuday48@gmail.com" and password as "Uday@151997" and clicks on the login button
    When Home page is displayed, the user clicks on the search bar, enters a valid "<product>" name, and clicks on the search icon
    Then the user should see the searched product page

    Examples:
      | product |
      | Mac     |
      | iPhone  |
      | Laptop  |
