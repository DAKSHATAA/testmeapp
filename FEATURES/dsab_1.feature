Feature: Login Test
- Description(optional): Registered user can login into TestMeApp using proper credentials
- Pre-Requisite is: Registration module should be completed
Example Mapping:
Busines Rule1: Signin link
Acceptance Criteria: Registered user should be logged in success to TestMeApp for search
Example: John wish to purchase an item from TestMeApp, he should login first to complete his transaction
Scenario: Login with Valid Credentials
Given user launch chromebrowser And enter TestMeApp URL
When user enter username in username field
When user enter password in password field
When user clicks on OK button
Then verify result