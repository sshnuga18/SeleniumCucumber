Feature: Register for testme app
Scenario: valid login scenario

Given url of testmeapp "http://10.232.237.143:443/TestMeApp/RegisterUser.htm"
When user enters username as "Sridevi12"
And user enters firstname as "Sridevii"
And user enters lastname as "Shnuga"
And user enters password as "abc1234"
And user enters confirmpassword as "abc1234"
And user clicks gender as "Female"
And user enters email as "sri@gmail.com"
And user enters mobilenumber as "1236547890"
And user enters DOB as "07/07/2019"
And user enters address as "gfhtjytjytjy"
And user selects sequrity question as "What is your Birth Place?"
And user enters answer as "Ooty"
Then the user is in login page