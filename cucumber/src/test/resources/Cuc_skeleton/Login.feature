Feature: Login feature for demo webshop
@data
Scenario Outline: valid login scenario
Given url of demowebshop "http://demowebshop.tricentis.com/login"
When  user enters "<username>" as username
And user enters "<password>" as password
Then user is in webshop as <type>

Examples:
|username|password|type|
|askmail@bmail.com|abc123|admin|
|askmail@ymail.com|abc123|guest|
|askmail@email.com|abc123|vendor|

@data1
Scenario: Data Table Example
Given Admin of the test me app enters
|electronics|headphones		|1|
|apparels		|sweat shirt  |2|
|electronics|USB			 		|2|