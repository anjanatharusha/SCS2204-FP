object checkNumber extends App{

  print("Enter a number: ")
  val num: Int = scala.io.StdIn.readInt()

  val result = num match {
    case num if num <= 0 => "Negative/Zero"
    case num if num % 2 == 0 => "Even number"
    case _ => "Odd number"
  }

  println(result)
}