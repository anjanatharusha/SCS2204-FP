object primeSeq extends App{

  def isPrime(n: Int, divisor: Int = 2): Boolean = (n, divisor) match {
    case (n, _) if (n < 2) => false
    case (n, _) if (n == divisor) => true
    case (n, _) if (n % divisor == 0) => false
    case (n, _) => isPrime(n, divisor + 1)
  }


  def primeSeq(n: Int): Unit = {
    if (n < 2) return
    primeSeq(n - 1)
    if (isPrime(n)) print(s"$n ")
  }

  primeSeq(10)
}