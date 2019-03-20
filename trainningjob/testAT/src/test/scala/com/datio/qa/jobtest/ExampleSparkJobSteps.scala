package com.datio.qa

import com.datio.integration.utils.exec.RunSpark
import com.datio.integration.utils.read.KafkaMetricReader
import cucumber.api.scala.{EN, ScalaDsl}
import org.apache.avro.generic.GenericRecord
import org.scalatest.Matchers

class ExampleSparkJobSteps extends Matchers with ScalaDsl with EN {

  var configFilePathHDFS = ""
  var exit_code: Int = _
  var messageFromKafka: GenericRecord = _

  Given("""^a config file path in HDFS (.*)$""") {
    (configFilePathHDFS: String) =>

      this.configFilePathHDFS = configFilePathHDFS
  }

  When("""^execute (.*) in Spark$""") {
    (mainClass: String) =>

      exit_code = RunSpark.exec(configFilePathHDFS, s"com.datio.qa.${mainClass}")
      println("Exit code: " + exit_code)
  }

 Then("""^the value of the exit_code is (.*)$""") {
    (value : Int) =>
    assert(exit_code.equals(value))

}
    }

