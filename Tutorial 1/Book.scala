object Book extends App {
  val price: Double = 24.95
  val shipCost1: Double = 3.00
  val shipCost2: Double = 0.75
  val dis: Double = 0.4

  def wholesale(copies: Int):Double=
    if ((copies>0)&&(copies<= 50))
      return (price * copies * (1-dis) + copies * shipCost1)
    else
      return (price * 50 * (1-dis) + 50 * shipCost1) + (price * (copies - 50) * (1-dis) + (copies - 50) * shipCost2)

  print(wholesale(60))
}
