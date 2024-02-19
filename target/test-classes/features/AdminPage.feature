#Author: Aravind
#Email: aravind.nimgiri@cigniti.com

Feature: Admin Page verification

@Admin
  Scenario: Verify whether user able to navigate to Jobs section
    Given I have logged into HRM portal with valid creds and navigated to home page
    When I click on Admin Menu Option and navigated to Jobs
    Then QA Eng job title should be displayed

