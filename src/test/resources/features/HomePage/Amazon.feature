@CucumberHooks
Feature: Product Description validation in amazon website.

  @AmzaonSecondHighestPriceTV
  Scenario: Amzon website validations
    Given User navigates to Amazon app URL
    When I click on "HamBurger" button
    And I scroll to "ShopByDepartment" element
    And I click on "TvAndAppliances" link
    And I click on "Televisions" link
    And I scroll to "Brands" element
     And I click on "Brands" checkbox
    And I click on "Samsung" checkbox
    When I click on "SortByFeature" button
    And I click on "HighToLow" link
    And I click on "SecondHighestPriceItem" link
    And Switch to next window
    And verify "AboutThisItem" element presence
    And log the "ItemDiscription" element description to report and console

  @AmzaonSecondHighestPriceTV
  Scenario: Amzon website validations test2
    Given User navigates to Amazon app URL
    When I click on "HamBurger" button
    And I scroll to "ShopByDepartment" element
    And I click on "TvAndAppliances" link
    And I click on "Televisions" link
    And I scroll to "Brands" element
    And I click on "Brands" checkbox
    And I click on "Samsung" checkbox
    When I click on "SortByFeature" button
    And I click on "HighToLow" link
    And I click on "SecondHighestPriceItem" link
    And Switch to next window
    And verify "AboutThisItem" element presence
    And log the "ItemDiscription" element description to report and console