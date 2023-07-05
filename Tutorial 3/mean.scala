import scala.math.BigDecimal.RoundingMode

object mean extends App{

  def mean(num1: Int, num2: Int): Float = {
    val sum = num1 + num2
    val average = sum.toFloat / 2
    BigDecimal(average).setScale(2, RoundingMode.HALF_UP).toFloat
  }

  printf("%.2f",mean(8,7))

}