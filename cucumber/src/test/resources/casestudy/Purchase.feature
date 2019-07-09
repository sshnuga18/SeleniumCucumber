Feature: TestMeApp purchase scenario 
Scenario Outline: person logins TestMeApp

Given TestMeApp url "http://10.232.237.143:443/TestMeApp/login.htm"
When person types username as "AlexUser"
And person types password as "Alex@123"
And person clicks login
And person clicks on the search store
And person types the word
And person click the product
Then product page is displayed


