@wip
Feature: User should be able to login with valid credentials.




  Scenario: Verify that User can login.

    When I enter username "bstouther8k@meetup.com" and password "byranncrowdson" and click on sign in button
    Then title should be displayed



  Scenario: Verify that User can not login with invalid credentials.

    When I enter invalid username "wrong" and password "wrong" and click on sign in button
    Then the system should show the error message as "[ObjectProgresEvent]"
