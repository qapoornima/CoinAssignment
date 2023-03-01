Feature: Currency Conversion
@Assignment
  Scenario: API calls to convert currencies
    Given Base URI is launching
    When i set the amount and get the first currency conversion value from Guatemalan Quetzal to British pounds
    Then i get the final conversion of the currency from GBP to doge coin
