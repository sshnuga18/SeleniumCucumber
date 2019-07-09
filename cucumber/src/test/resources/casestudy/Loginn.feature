Feature: Test meapp login
Scenario Outline: give valid login
Given url  "http://10.232.237.143:443/TestMeApp/login.htm"
When  person types "<username>" as username
And person types "<password>" as password
Then home page is displayed

Examples:
|username|password|
|Lalitha|password123|
