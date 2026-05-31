Feature: Login to DemoQA

  Scenario: User can open the Text Box page
    Given I open the DemoQA homepage
    When I click on the Elements card
    And I click on the Text Box menu
    Then I should see the Text Box form

  Scenario: User can fill and submit the Text Box form
    Given I open the DemoQA homepage
    When I click on the Elements card
    And I click on the Text Box menu
    And I fill the form with name "John Doe" email "john@example.com" current address "123 Main St" permanent address "456 Other St"
    And I submit the form
    Then I should see the output