	
	@Smoketest
Feature: Search feature of google


  Scenario: Check search bar works properly
    Given user launches the browser
    When user enters url
    Then user is navigated to search page
    And user enters text in search bar and clicks on search
    Then user gets results
