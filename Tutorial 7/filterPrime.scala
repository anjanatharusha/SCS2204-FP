object filterPrime extends App{
  def filterPrime(numbers: List[Int]): List[Int] = {

    val isPrime: Int => Boolean = number => {
      if (number <= 1) {
        false
      } else if (number <= 3) {
        true
      } else if (number % 2 == 0 || number % 3 == 0) {
        false
      } else {
        var i = 5
        while (i * i <= number) {
          if (number % i == 0 || number % (i + 2) == 0) {
            false
          }
          i += 6
        }
        true
      }
    }

    numbers.filter(isPrime)
  }

  val input = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val output = filterPrime(input)
  println(output)
}