#Author: Aravind
#Email: aravind.nimgiri@cigniti.com

Feature: Login page verification

  Scenario Outline: Verify whether user able to login to Orange HRM
    Given I am on login page
    When I provide username "<username>" and password "<password>"
    And click on login button
    Then Home page should be displayed

    Examples: 
      | username  | password |
      | Admin			| admin123 |
