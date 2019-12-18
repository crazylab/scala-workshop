package functions

object Functions {

  def infoLog(message: String, args: String*): String = {
    args.foldLeft(message)((result, arg) => result.replaceFirst("\\{\\}", arg))
  }

  val addOne = (a: Int) => a + 1

  val divideBy2 = (x: Int) => x / 2

  val incrementAndDivideBy2: Int => Int = addOne andThen divideBy2

  //  def repeat(i: Int): String => String = (str: String) => str * i

  def repeat(times: Int)(str: String): String = str * times

  def repeat5Times(str: String): String = repeat(5)(str)

  def repeat10Times(str: String): String = repeat(10)(str)



}

