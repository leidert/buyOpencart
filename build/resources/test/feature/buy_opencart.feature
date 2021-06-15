Feature: opencart page test

  Scenario Outline: buy on opencart
    Given that enter of the opencart page it made the search for a computer <brand>
    And enter the product
    When added it to cart
    And verifying that it is the chosen computer
      |brand  |
      |<brand>|
    And proceed with the payment
    |emailUser|password|
    |<emailUser>|<password>|
    Then enter the purchase history
    And verifying that the purchase order is confirmed
      | firstNameUser   | lastNameUser   | emailUser   | password | telephoneUser   | company   | address   | city   | postCode   | country   | state   | brand |
      | <firstNameUser> | <lastNameUser> | <emailUser> | <password>| <telephoneUser>  | <company> | <address> | <city> | <postCode> | <country> | <state> | <brand> |
    Examples:
      | firstNameUser | lastNameUser | emailUser                  | password | telephoneUser |  company | address      | city     | postCode   | country  | state   | brand |
      | leider        | tanos        | leider.tanos1000@gmail.com | 123456   | 1234567       | sqa      | weweweewewewe| monteria | 230003     | colombia | cordoba |Sony VAIO|
