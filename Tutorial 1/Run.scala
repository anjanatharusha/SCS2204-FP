object Run extends App{
  val easyPace:Double=8
  val tempo:Double=7

  def runTime(e1:Double,t:Double,e2:Double)=(e1+e2)/easyPace + t/tempo

  print(runTime(2,3,2))
}