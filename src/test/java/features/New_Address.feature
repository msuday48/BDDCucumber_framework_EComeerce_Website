Feature: Validating Address Book by entering a new address

  Scenario Outline: Add new address to the Address Book
    Given User logs  in with valiid email "msuday68@gmail.com" and password "Uday@151997" clicks on My Account and selects My Account
    When User navigates to Address Book Entries and clicks on the "New Address" button
    Then User enters "<firstname>", "<lastname>", "<address1>", "<city>", "<postcode>", and "<country>"
    And User selects "<country>" from the country dropdown and "<region>" from the region dropdown
    And User clicks on the "Continue" button

    Examples:
      | firstname | lastname | address1                          | city     | postcode | country | region |
      | Uday      | MS       | Bangalore BTM Layout 2nd Stage   | Bangalore| 560076   | Turkey  | Adana  |
