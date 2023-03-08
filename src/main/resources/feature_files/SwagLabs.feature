@Regression
Feature: SwagLabs
  Purchasing items in swaglab


  Purchasing item in swaglab
  @Swag
  Scenario: 1- Happy path to purchase an item
    Given I am on the swag lab homepage "https://www.saucedemo.com/"
    When I enter valid username as "standard_user" and valid password as "secret_sauce"
    And I click on Login button
    And I click on the first item "Sauce Labs Backpack" on the products page
    And I click on Add to Cart button
    And I click on Shopping Cart icon
    And I click on Checkout
    And I enter First Name as "Bilkisu" Last Name as "Muhammad" and Zip_Postal Code as "900001"
    And I click Continue button
    And I click Finish button
    Then "Thank you for your order!" should be displayed

  Scenario: 2- Error message should be displayed if postcode field is not populated on the checkout page
    Given I am on the swag lab homepage
    When I enter valid username and valid password
    And I click on Login button
    And I click on the first item "Sauce Labs Backpack" on the products page
    And I click on Add to Cart button
    And I click on Shopping Cart icon
    And I click on Checkout
    And I enter First Name Last Name only but no ZipPostalCo
    And I click Continue button
    Then "Error: Postal Code is required" should be displayed on the Checkout Your Information page

    Scenario: 3- Error msg should be displayed if Firstname field is not populated on the checkout page
      Given I am on the swag lab homepage
      When I enter valid username and valid password
      And I click on Login button
      And I click on the first item "Sauce Labs Backpack" on the products page
      And I click on Add to Cart button
      And I click on Shopping Cart icon
      And I click on Checkout
      And I enter only Last Name and PostalCode
      And I click Continue button
      Then "Error: First Name is required" should be displayed on the Checkout Your Information page



  Scenario:4- Error msg should be displayed if Lastname field is not populated on the checkout page
    Given I am on the swag lab homepage
    When I enter valid username and valid password
    And I click on Login button
    And I click on the first item "Sauce Labs Backpack" on the products page
    And I click on Add to Cart button
    And I click on Shopping Cart icon
    And I click on Checkout
    And I enter only First Name and PostalCode
    And I click Continue button
    Then "Error: Last Name is required" should be displayed on the Checkout Your Information page


  Scenario:5- Error msg should be displayed if invalid password is entered for login
    Given I am on the swag lab homepage "https://www.saucedemo.com/"
    When I enter valid username as "standard_user" and valid password as "secret_sauces"
    And I click on Login button
    Then "Epic sadface: Username and password do not match any user in this service" error message is displayed and I am not logged in
  @smoke
  Scenario:6- Check that items can be added and removed from the cart
    Given I am on the swag lab homepage "https://www.saucedemo.com/"
    When I enter valid username as "standard_user" and valid password as "secret_sauce"
    And I click on Login button
    And I click on the first item "Sauce Labs Backpack" on the products page
    And I click on Add to Cart button
    Then "1" item is added to the cart
    When I click remove button
    Then cart should have no item in it


