Feature: Shout feature
@tag1
Scenario: Saun and Lucia are within range
Given  Saun is 20 meters away from Lucia
When Saun shouts "Free Coffee"
Then  Lucia listens to the message
@tag2
Scenario: Saun and Lucia are not in range
Given Saun is 1000 meters away from Lucia
When  Saun shouts "Free Coffee"
Then  Lucia cannot listen to the message