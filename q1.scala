object q1{
    val calculateInterest: Double => Double = deposit => {
    if (deposit <= 20000) deposit * 0.02
    else if (deposit <= 200000) deposit * 0.04
    else if (deposit <= 2000000) deposit * 0.035
    else deposit * 0.065
    }
    
    def main(args: Array[String]): Unit = {
    val depositAmount = 500000.0
    val interest = calculateInterest(depositAmount)
    println(s"Interest for a deposit of Rs. $depositAmount is Rs. $interest")
  }
}