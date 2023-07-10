object prime extends App{

  def isPrime(n: Int, divisor: Int = 2): Boolean = (n, divisor) match {
    case (n, _) if (n < 2) => false
    case (n, _) if (n == divisor) => true
    case (n, _) if (n % divisor == 0) => false
    case (n, _) => isPrime(n, divisor + 1)
  }

  def prime(n: Int):Boolean = {
    isPrime(n)
  }

  println(prime(5))
  println(prime(8))
}