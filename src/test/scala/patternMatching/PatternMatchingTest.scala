import org.scalatest.{Matchers, FunSuite}
import collections.PatternMatching._

class PatternMatching extends FunSuite with Matchers {

  "fibonacci" should "return the fibonacci series upto digits provided" in {
    fibonacci(7) should be(List(0, 1, 1, 2, 3, 5, 8))
  }

  "flatten" should "return flattened array of just integers present" in {
    val nestedList = List(1, List(2, 3, 4, 5, 6, 7), 8)
    flatten(nestedList) should be(List(1, 2, 3, 4, 5, 6, 7, 8))
  }

  "flatten" should "return flattened array of 5 level nesting" in {
    val nestedList = List(0, 2, List(List(2, 3), 8, 100, 4, List(List(List(50)))), -2)
    flatten(nestedList) should be(List(0, 2, 2, 3, 8, 100, 4, 50, -2))
  }

  "flatten" should "return flattened array of 6 level nest list with null values" in {
    val nestedList = List(0, 2, List(List(2, 3), 8, List(List(100)), null, List(List(null))), -2)
    flatten(nestedList) should be(List(0, 2, 2, 3, 8, 100, -2))
  }

  "flatten" should "return empty array when nested list with all null values" in {
    val nestedList = List(null, List(List(List(null))), null, null, List(List(null, null), null), null)
    flatten(nestedList) should be(List())
  }

  "convertToInt" should "return the number when number is sent in a string" in {
    convertToInt("23") should be("The number is 23")
  }

  "convertToInt" should "return the failure statement when a number is not sent in a string" in {
    convertToInt("some string") should be("That didn't work.")
  }

  "response" should "handle shouting" in {
    response("WATCH OUT!") should be("Whoa, chill out!")
  }

  "response" should "handle shouting gibberish" in {
    response("FCECDFCAAB") should be("Whoa, chill out!")
  }

  "response" should "handle asking question" in {
    response("Does this cryogenic chamber make me look fat?") should be("Sure.")
  }

  "response" should "handle asking numeric question" in {
    response("You are, what, like 15?") should be("Sure.")
  }

  "response" should "handle asking gibberish question" in {
    response("fcecdfcaab?") should be("Sure.")
  }

  "response" should "handle asking forceful question" in {
    response("WHAT THE HELL WERE YOU THINKING?") should be("Calm down, I know what I'm doing!")
  }

  "response" should "handle statement containing question mark" in {
    response("Ending with ? means a question.") should be("Whatever.")
  }

  "response" should "handle using acronyms in regular speech" in {
    response("It's OK if you don't want to go to the DMV.") should be("Whatever.")
  }

  "response" should "handle silence" in {
    response("") should be("Fine. Be that way!")
  }

  "response" should "handle p[rolonged silence" in {
    response("             ") should be("Fine. Be that way!")
  }
}
