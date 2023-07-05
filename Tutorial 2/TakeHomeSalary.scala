object TakeHomeSalary extends App{
  def calculateTakeHomeSalary(normalHours: Int, otHours: Int): Double = {
    val normalRate = 250
    val otRate = 85
    val taxRate = 0.12

    val normalPay = normalHours * normalRate
    val otPay = otHours * otRate
    val grossSalary = normalPay + otPay
    val taxAmount = grossSalary * taxRate
    val takeHomeSalary = grossSalary - taxAmount

    takeHomeSalary
  }

  print(calculateTakeHomeSalary(40,30))

}