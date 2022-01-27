
Feature: User should be able to make and manage a reservation on Book it application.

Background: Login steps
  Given I am on the login page
  When I enter username "bstouther8k@meetup.com" and password "byranncrowdson" and click on sign in button

  @wip
  Scenario: Verify that the student can make a reservation.
    Given I am on the hunt page
    When I select date, time and click on search button
    Then Free spots should be displayed
    When I click on book button on selected spot and confirm
    Then Success message should be displayed

  Scenario: Verify that authorized user can reserve only one room maximum per day.
    When
    Then

  Scenario: Verify that authorized user can cancel the reserved room at any time.
    Given I am on the My Schedule page
    When I select reservation and click cancel button
    Then Confirmation message should be displayed

  Scenario: Verify that during the reservation, authorized users can only book the room for
  future hours.
    Given I am on the hunt page
    And I click on calendar button
    Then Only future days should clickable
    When I select time only future time should be available


