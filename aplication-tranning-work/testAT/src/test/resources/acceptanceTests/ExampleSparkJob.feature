@ActivateSegment
Feature: Account Holder withdraws cash

  Scenario Outline: The account has sufficient funds
    Given an account with a balance of $100.5
    When the Account Holder requests $20.25
    Then the account balance should be $80.25
