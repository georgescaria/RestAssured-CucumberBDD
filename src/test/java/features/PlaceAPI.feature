Feature: Validate Place APIs

  Scenario: Add Place API
    Given Add Place Payload
    When User calls "API" API with POST HTTP request
    Then API call is success with status code 200
    And "<key>" in response body is "<value>"

  	Examples:
	   	|	key		| value	|
			| scope | APP		|
			|status	|	OK		|

