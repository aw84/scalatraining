object Example {
  def main(args: Array[String]): Unit = {
    printAny("Hello Any")
    printUnit("Hello Unit")
    val mt = MilTime.apply(time = 1023)
    println(mt)
  }

  def printAny(x: Any) = {
    println(x.getClass(), x)
  }

  def printUnit(x: Unit) = {
    println(x.getClass(), x)
  }
}
