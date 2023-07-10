object oddEven extends App{

  def isEven(n: Int): Boolean = {
    if (n == 0) true
    else if (n == 1) false
    else isEven(n - 2)
  }

  def isOdd(n: Int): Boolean = {
    if (n == 0) false
    else if (n == 1) true
    else isOdd(n - 2)
  }

  println(isEven(24))
  println(isEven(13))
  println(isOdd(17))
  println(isOdd(8))

}