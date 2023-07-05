object interest extends App{

  def calculateInterest(depositAmount: Double): Double = {
    if(depositAmount > 0){
      val interestRate = depositAmount match {
        case amount if amount <= 20000 => 0.02
        case amount if amount <= 200000 => 0.04
        case amount if amount <= 2000000 => 0.035
        case _ => 0.065
      }
      val interestEarned = depositAmount * interestRate
      interestEarned

    }else{
      println("Error: Invalid deposit amount")
      0.0
    }
  }

  val deposit = 50000
  val interest = calculateInterest(deposit)
  print(s"The interest earned on a deposit of Rs. $deposit is Rs. $interest")


}