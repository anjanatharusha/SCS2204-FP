object changeCase extends App{

  def toUpper(name: String): String = {
    name.toUpperCase()
  }

  def toLower(name: String): String = {
    name.toLowerCase()
  }

  def formatNames(name: String, formatFunction: String => String): String = {
    formatFunction(name)
  }

  val str = "ABCabc"
  println(toUpper(str))
  println(toLower(str))

  //use slice to divide strings
  println(formatNames("Benny", toUpper))
  println(formatNames("Niroshan", (name: String) => toUpper(name.slice(0, 2)) + toLower(name.slice(2, 8))))
  println(formatNames("Saman", toLower))
  println(formatNames("Kumara", (name: String) => toUpper(name.slice(0, 1)) + toLower(name.slice(1, 5)) + toUpper(name.slice(5, 6))))

  
}