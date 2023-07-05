import math.BigDecimal.double2bigDecimal

object BestTicketPrice extends App{

  def calculateProfit(ticketPrice: Double): Double = {
    val initialAttendance = 120
    val attendanceIncrease = 20
    val attendanceDecrease = 20
    val costPerPerformance = 500
    val costPerAttendee = 3

    val attendance = if (ticketPrice <= 15) {
      initialAttendance + ((15 - ticketPrice) / 5) * attendanceIncrease
    } else {
      initialAttendance - ((ticketPrice - 15) / 5) * attendanceDecrease
    }

    val revenue = ticketPrice * attendance
    val cost = costPerPerformance + (costPerAttendee * attendance)
    val profit = revenue - cost

    profit
  }

  def findBestTicketPrice(): Double = {
    val ticketPriceRange = BigDecimal(0.0) to BigDecimal(50.0) by BigDecimal(0.1)
    val profits = ticketPriceRange.map(price => (price.toDouble, calculateProfit(price.toDouble)))
    val bestPrice = profits.maxBy(_._2)._1

    bestPrice
  }

  val bestTicketPrice = findBestTicketPrice()

  println(s"The best ticket price for maximum profit is: $bestTicketPrice")

}