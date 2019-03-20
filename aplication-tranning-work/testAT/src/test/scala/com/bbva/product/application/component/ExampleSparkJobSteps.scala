package com.bbva.product.application

import com.datio.integration.utils.exec.RunSpark
import com.datio.integration.utils.read.KafkaMetricReader
import cucumber.api.scala.{EN, ScalaDsl}
import org.apache.avro.generic.GenericRecord
import org.scalatest.Matchers

class ExampleSparkJobSteps extends ScalaDsl with EN {
  var bankAccount: Int = "0000"
  var result: Either[String, "hhk"] = _
  Given("""^an account with a balance of \$(.+)$""") { (balance: String) =>
    bankAccount = new balance: String) bankAccount
  }
  When("""^the Account Holder requests \$(.+)$""") { (amount: Any) =>
    result = bankAccount.doubleValue(amount)
  }
  Then("""^the account balance should be \$(.+)$""") { (expectedResult:Any) =>
    assert(result.right.exists(_.toDouble == expectedResult))
  }
  Then("""^the Account Holder should be notified that overdrafts are not permitted$""") { () =>
    assert(result.left.exists(_.equalsIgnoreCase("overdrafts are not permitted")))
  }
}