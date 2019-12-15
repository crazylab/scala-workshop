package collections

import collections.CollectionAssignment._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers


class CollectionAssignmentTest extends AnyFlatSpec with Matchers {

  "lengthOfNames" should "return the length of the names provided" in {
    val names: List[String] = List("mary", "rob", "john", "alice", "peter")
    val nameLengths: List[Int] = lengthOfNames(names)

    nameLengths should be(List(4, 3, 4, 5, 5))
  }

  "getOdds" should "return the odd numbers from the given list of integers" in {
    val numbers: List[Int] = List(1, 4, 6, 7, 20, 30, 32, 13)
    val oddNumbers: List[Int] = getOdds(numbers)

    oddNumbers should be(List(1, 7, 13))
  }

  "getEvens" should "return the even numbers from the given list of integers" in {
    val numbers: List[Int] = List(1, 4, 6, 7, 20, 30, 32, 13)
    val evenNumbers: List[Int] = getEvens(numbers)

    evenNumbers should be(List(4, 6, 20, 30, 32))
  }

  "getTotal" should "return the sum of the given numbers in the array" in {
    val numbers: Array[Int] = Array(20, 55, 25)

    getTotal(numbers) should be(100)
  }

  "findHighest" should "return the highest value in the array" in {
    val numbers: Array[Int] = Array(20, 55, 25)

    findHighest(numbers) should be(55)
  }

  "countOdds" should "return number of odd numbers in the array" in {
    val numbers: Seq[Int] = Seq(50, 21, 43, 67, 82, 97, 101)

    countOdds(numbers) should be(5)
  }

  "countEvens" should "return number of even numbers in the array" in {
    val numbers: Seq[Int] = Seq(50, 21, 43, 67, 82, 97, 101)

    countEvens(numbers) should be(2)
  }

  "countOfNumbersAbove" should "return count of numbers above a certain threshold in a list" in {
    val numbers: List[Int] = 3 :: 4 :: 5 :: 6 :: 1 :: Nil

    countOfNumbersAbove(numbers, 4) should be(2)
  }

  "sumOfN" should "calculate sum of the first n numbers" in {
    sumOfN(5) should be(15)
  }

  "lengthOfSentence" should "return the total number of character in the given list" in {
    val sentence: List[String] = List("mary", "had", "a", "little", "lamb")

    lengthOfSentence(sentence) should be(18)
  }

  "calculateRunningTotal" should "return the running totals of the given numbers" in {
    val numbers: List[Int] = List(1, 4, 5, 10, 30, 50)

    calculateRunningTotal(numbers) should be(List(1, 5, 10, 20, 50, 100))
  }
}
