@ActivateSegment
Feature: Feature for ExampleSparkJob

  Scenario: Test ExampleSparkJob should result OK
    Given a config file path in HDFS hdfs://hadoop:9000/ExampleSparkJob.conf
    When execute ExampleSparkJob in Spark

  Scenario Outline: Test custom implementations result OK
    Given a config file path in HDFS hdfs://hadoop:9000/<pathConfig>.conf
    When execute ExampleSparkJob in Spark
    Then the value of the exit_code is 0

      Examples:
        | pathConfig     |
        | ExampleSparkJob |

