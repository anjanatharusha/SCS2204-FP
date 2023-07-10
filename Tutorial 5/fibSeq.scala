object fibSeq extends App{

  def calFib(n: Int): Int = {
    if (n <= 0) 0
    else if (n == 1) 1
    else calFib(n - 1) + calFib(n - 2)
  }

  def printFibSeq(n: Int): Unit = {
    for (i <- 0 until n) {
      val fib = calFib(i)
      print(s"$fib ")
    }
  }

  printFibSeq(10)
}