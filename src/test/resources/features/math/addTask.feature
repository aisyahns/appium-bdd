Feature: Add Task
  As a user
  I want to add task
  So I can manage my task

  Scenario: Add Task with valid data
    Given I am on the my task page
    When I click add button
    And I input task title
    And I input task content
    And I click Save button
    Then my task will be saved