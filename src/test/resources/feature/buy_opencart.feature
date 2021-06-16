  @General
  Feature: opencart page test

      @Exists
      Scenario Outline: buy on opencart
        Given that enter of the opencart page it made the search for a computer <brand>
        And enter the product
        When added it to cart
        And verifying that it is the chosen computer
          |brand  |
          |<brand>|
        And that heading to checkout
        And proceed with the payment
        |emailUser|password|
        |<emailUser>|<password>|
        Then verifying that the purchase order is confirmed
          | emailUser   | password | brand |  OrderSuccessful |
          | <emailUser> | <password>|<brand> | <OrderSuccessful> |
        Examples:
          | emailUser                  | password | brand | OrderSuccessful |
          | leider.tanos1000@gmail.com | 123456   | Sony VAIO  |Your order has been placed!|

    @Null
      Scenario Outline: buy on opencart
        Given that enter of the opencart page it made the search for a computer <brand>
        Then verify that the product does not exist <message>
        Examples:
          | brand | message|
          | dell  | Your shopping cart is empty!|