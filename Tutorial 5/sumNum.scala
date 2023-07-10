object sumNum extends App{

  def sum(n: Int): Int = {
    if (n <= 0) 0
    else n + sum(n - 1)
  }

  print(sum(5))
}