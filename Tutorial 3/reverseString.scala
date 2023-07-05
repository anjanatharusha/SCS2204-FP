object reverseString extends App{

  def reverse(input: String, index: Int, reversed: String): String = {
    if (index < 0) reversed
    else reverse(input, index - 1, reversed + input(index))
  }

  def reverseString(input: String): String = reverse(input, input.length - 1, "")

  println(reverseString("ABC"))

}