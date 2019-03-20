@ActivateSegment
Feature: Feature for ExampleSparkJob

  Scenario Outline: Test example inputs
    Given inputx1 is <input_1> and inputx2 is <input_2> values
    When make the sun inputx1 and inputx2
    Then result is <Result>

      Examples:
        | input_1 | input_2 | Result |
        | 20      | 30      | 50     |



