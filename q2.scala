object q2 {
  val checkNumberType: Int => String = number => number match {
    case n if n <= 0 => "Negative/Zero is input"
    case n if n % 2 == 0 => "Even number is given"
    case _ => "Odd number is given"
  }

  def main(args: Array[String]): Unit = {
    if (args.length > 0) {
      val input = args(0).toInt
      val result = checkNumberType(input)
      println(result)
    } else {
      println("Please provide an integer input.")
    }
  }
}
