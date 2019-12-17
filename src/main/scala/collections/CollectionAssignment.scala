package collections

object CollectionAssignment {
  //  Do not use for/while loops while solving these problem
  private val isOdd: Int => Boolean = _ % 2 != 0

  def lengthOfNames(names: List[String]): List[Int] = names.map(name => name.length)

  def getOdds(numbers: List[Int]): List[Int] = numbers.filter(isOdd)

  def getEvens(numbers: List[Int]): List[Int] = numbers.filter(!isOdd(_))

  def getTotal(numbers: Array[Int]): Int = numbers.reduce(_ + _)

  def findHighest(numbers: Array[Int]): Int = numbers.reduce((result, n) => if (result > n) result else n)

  def countOdds(numbers: Seq[Int]): Int = numbers.count(isOdd)

  def countEvens(numbers: Seq[Int]): Int = numbers.count(!isOdd(_))

  def countOfNumbersAbove(numbers: List[Int], threshold: Int): Int = numbers.count(_ > threshold)

  //  Do not use any formula to calculate
  def sumOfN(n: Int): Int = (1 to n).sum

  //  Try to do it in one line
  def lengthOfSentence(sentence: List[String]): Int = sentence.foldLeft(0)((total, word) => total + word.length)

  //  Try to do it in one line
  def calculateRunningTotal(numbers: List[Int]): List[Int] = numbers.tail.scan(numbers.head)(_ + _)
}
