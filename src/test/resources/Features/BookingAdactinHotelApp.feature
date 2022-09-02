Feature: AdactinHotelApp

  Scenario Outline: Booking Rooms in AdactinHotelApp with valid data
    Given User is on the Adactin Hotel App
    When User should enter "<userName>" and "<password>"
    And User should enter "<location>", "<hotels>", "<roomType>", "<noOfRooms>", "<checkInDate>", "<checkOutDate>", "<adults>" and "<children>"
    And User should select Hotel
    And User should enter details "<firstName>", "<lastName>", "<billingAddress>", "<creditCardNo>", "<creditCardType>", "<expiryMonth>", "<expiryYear>" and "<cvvNumber>"
    Then User should verify booking successful

    Examples: 
      | userName     | password | location    | hotels         | roomType     | noOfRooms | checkInDate | checkOutDate | adults    | children  | firstName | lastName | billingAddress | creditCardNo     | creditCardType   | expiryMonth | expiryYear | cvvNumber |
      | Sivasankaran | Siva1983 | Sydney      | Hotel Creek    | Standard     | 1 - One   | 22-09-2022  | 23-09-2022   | 1 - One   | 0 - None  | Sa        | E        | Chennai        | 1617181918181900 | American Express | January     |       2022 |       111 |
      #| Sivasankaran | Siva1983 | Melbourne   | Hotel Sunshine | Double       | 2 - Two   | 23-09-2022  | 24-09-2022   | 2 - Two   | 1 - One   | Sh        | V        | Madurai        | 1617181918181900 | VISA             | February    |       2022 |       112 |
      #| Sivasankaran | Siva1983 | Brisbane    | Hotel Hervey   | Deluxe       | 3 - Three | 24-09-2022  | 25-09-2022   | 3 - Three | 2 - Two   | Si        | M        | Coim           | 1617181918181900 | Master Card      | March       |       2022 |       113 |
      #| Sivasankaran | Siva1983 | Adelaide    | Hotel Cornice  | Super Deluxe | 4 - Four  | 25-09-2022  | 26-09-2022   | 4 - Four  | 3 - Three | Th        | A        | Vadapalani     | 1617181918181900 | Other            | April       |       2022 |       114 |
      #| Sivasankaran | Siva1983 | London      | Hotel Creek    | Standard     | 5 - Five  | 26-09-2022  | 27-09-2022   | 1 - One   | 4 - Four  | Pal       | I        | Palani         | 1617181918181900 | American Express | May         |       2022 |       115 |
      #| Sivasankaran | Siva1983 | New York    | Hotel Sunshine | Double       | 6 - Six   | 27-09-2022  | 28-09-2022   | 2 - Two   | 0 - None  | Chan      | A        | Adyaar         | 1617181918181900 | VISA             | June        |       2022 |       116 |
      #| Sivasankaran | Siva1983 | Los Angeles | Hotel Hervey   | Deluxe       | 7 - Seven | 28-09-2022  | 29-09-2022   | 3 - Three | 1 - One   | Vij       | A        | Vadapalani     | 1617181918181900 | Master Card      | July        |       2022 |       117 |
      #| Sivasankaran | Siva1983 | Paris       | Hotel Cornice  | Super Deluxe | 8 - Eight | 29-09-2022  | 30-09-2022   | 4 - Four  | 2 - Two   | Lat       | A        | Palani         | 1617181918181900 | Other            | August      |       2022 |       118 |

  Scenario Outline: Booking Rooms in AdactinHotelApp with valid data 1
    Given User is on the Adactin Hotel App
    When User should enter "<userName>" and "<password>"
    And User should enter "<location>", "<hotels>", "<roomType>", "<noOfRooms>", "<checkInDate>", "<checkOutDate>", "<adults>" and "<children>"
    And User should select Hotel
    And User should enter details "<firstName>", "<lastName>", "<billingAddress>", "<creditCardNo>", "<creditCardType>", "<expiryMonth>", "<expiryYear>" and "<cvvNumber>"
    Then User should verify booking successful

    Examples: 
      | userName     | password | location    | hotels         | roomType     | noOfRooms | checkInDate | checkOutDate | adults    | children  | firstName | lastName | billingAddress | creditCardNo     | creditCardType   | expiryMonth | expiryYear | cvvNumber |
      | Sivasankaran | Siva1983 | Sydney      | Hotel Creek    | Standard     | 1 - One   | 22-09-2022  | 23-09-2022   | 1 - One   | 0 - None  | Sa        | E        | Chennai        | 1617181918181900 | American Express | January     |       2022 |       111 |
      #| Sivasankaran | Siva1983 | Melbourne   | Hotel Sunshine | Double       | 2 - Two   | 23-09-2022  | 24-09-2022   | 2 - Two   | 1 - One   | Sh        | V        | Madurai        | 1617181918181900 | VISA             | February    |       2022 |       112 |
      #| Sivasankaran | Siva1983 | Brisbane    | Hotel Hervey   | Deluxe       | 3 - Three | 24-09-2022  | 25-09-2022   | 3 - Three | 2 - Two   | Si        | M        | Coim           | 1617181918181900 | Master Card      | March       |       2022 |       113 |
      #| Sivasankaran | Siva1983 | Adelaide    | Hotel Cornice  | Super Deluxe | 4 - Four  | 25-09-2022  | 26-09-2022   | 4 - Four  | 3 - Three | Th        | A        | Vadapalani     | 1617181918181900 | Other            | April       |       2022 |       114 |
      #| Sivasankaran | Siva1983 | London      | Hotel Creek    | Standard     | 5 - Five  | 26-09-2022  | 27-09-2022   | 1 - One   | 4 - Four  | Pal       | I        | Palani         | 1617181918181900 | American Express | May         |       2022 |       115 |
      #| Sivasankaran | Siva1983 | New York    | Hotel Sunshine | Double       | 6 - Six   | 27-09-2022  | 28-09-2022   | 2 - Two   | 0 - None  | Chan      | A        | Adyaar         | 1617181918181900 | VISA             | June        |       2022 |       116 |
      #| Sivasankaran | Siva1983 | Los Angeles | Hotel Hervey   | Deluxe       | 7 - Seven | 28-09-2022  | 29-09-2022   | 3 - Three | 1 - One   | Vij       | A        | Vadapalani     | 1617181918181900 | Master Card      | July        |       2022 |       117 |
      #| Sivasankaran | Siva1983 | Paris       | Hotel Cornice  | Super Deluxe | 8 - Eight | 29-09-2022  | 30-09-2022   | 4 - Four  | 2 - Two   | Lat       | A        | Palani         | 1617181918181900 | Other            | August      |       2022 |       118 |
