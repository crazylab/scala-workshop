package functions

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import Functions._

class FunctionsTest extends AnyFlatSpec with Matchers {

  "infoLog" should "construct the log message with all parameters" in {
    val args = List("10.210.142.50", "20th Dec, 2019")
    val message = infoLog("Running job at node {}, time {}", args: _*)

    message should be("Running job at node 10.210.142.50, time 20th Dec, 2019")
  }

  "incrementAndDivideBy2" should "compose add and divide function to generate a new function" in {
    //    There are 2 functions (addOne and DivideBy2) functions already provided. Use them to implement the incrementAndDivideBy2 function
    addOne(10) should be(11)
    divideBy2(10) should be(5)
    incrementAndDivideBy2(5) should be(3)
  }

  "repeat" should "repeat the given string the given number of times" in {
    repeat5Times("*") should be("*****")
    repeat10Times("*") should be("**********")
  }

  "whileLoop" should "process execute the function until the breaking condition is met" in {
    var i = 1
    whileLoop(i < 10) {
      println(i)
      i = i + 1
    }

    i should be(10)
  }

  "isOdd" should "return true when the given integer number is an odd number" in {
    import functions.Functions.IntFunctions

    5.isOdd() should be(true)
    8 isOdd() should be(false)
  }

}
