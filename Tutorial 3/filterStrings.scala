object filterStrings extends App{

  def filterStrings(list: List[String]): List[String] = {
    var result: List[String] = List.empty[String]

    for (i <- 0 until list.length) {
      val str = list(i)
      if (str.length > 5) {
        result = result ::: List(str)
      }
    }
    result
  }

  val names = List("anjana", "dhananjaya", "amal", "himansa", "diwyanjalee", "kasun")
  val filteredList = filterStrings(names)
  println(filteredList)


}