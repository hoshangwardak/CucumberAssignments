@1
Feature: Wikipedia Search Functionality

  Background:
    Given user is on Wikipedia page

  @TC25
  Scenario: Wikipedia Search Functionality Title Verification
    When user types Steve Jobs in the search box and clicks
    Then user should see Steve Jobs in the wiki title

  @TC26
  Scenario: Wikipedia Search Functionality Header Verification
    When user types Steve Jobs in the search box and clicks
    Then User should see Steve Jobs is in the main header

  @TC27
  Scenario: Wikipedia Search Functionality  Image Header Verification
    When user types Steve Jobs in the search box and clicks
    Then User should see Steve Jobs is in the image header

