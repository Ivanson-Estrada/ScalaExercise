package com.datio.qa

import com.datio.spark.InitSpark
import com.datio.spark.metric.model.BusinessInformation
import com.typesafe.config.Config
import org.apache.spark.sql.SparkSession

/**
  * Main file for ExampleSparkJob process.
  * Implements InitSpark which includes metrics and SparkSession.
  *
  * Configuration for this class should be expressed in HOCON like this:
  *
  * ExampleSparkJob {
  *   ...
  * }
  *
  */
protected trait ExampleSparkJobTrait extends InitSpark {
  this: InitSpark =>
    /**
      * @param spark Initialized SparkSession
      * @param config Config retrieved from args
      */
    override def runProcess(spark : SparkSession, config : Config): Int = {

      this.logger.info("Init process ExampleSparkJob")

      val exitCode = 0

      println("Ivan")

      exitCode

    }

  override def defineBusinessInfo(config: Config): BusinessInformation =
    BusinessInformation(exitCode = 0, entity = "", path = "", mode = "",
                        schema = "", schemaVersion = "", reprocessing = "")

}

object ExampleSparkJob extends ExampleSparkJobTrait with InitSpark

