package com.bbva.product.application

import com.datio.integration.utils.exec.RunSpark
import com.datio.integration.utils.read.KafkaMetricReader
import cucumber.api.scala.{EN, ScalaDsl}
import org.apache.avro.generic.GenericRecord
import org.scalatest.Matchers

class ExampleSparkJobSteps extends Matchers with ScalaDsl with EN {

  var input_1: Int = 20
  var input_2: Int = 30
  var Resultado: Int = 50

  Given("""^inputx1 is (.*) and inputx2 is (.*) values$""") {
    (valor1: Int, valor2: Int) =>
      assert(input_1.equals(valor1))
      assert(input_2.equals(valor2))

      print("Se validaron los inputs")
  }

  When(""""^make the sun inputx1 and inputx2$""") {
    print("Make the sun" + input_1 + input_2)

  }

  Then("""^Result is (.*)$""") {
    (Res : Int) =>
      assert(Resultado.equals(Res))

      print("El resultado fue"+ Resultado)
  }


}

