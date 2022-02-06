package lectures.part1basics

object CBNvsCBV extends App {
  def calledByValue(x: Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }
  // value is computed before call
  // same value used everywhere

  def calledByName(x: => Long): Unit = {
    println("by name: " + x)
    println("by name: " + x)
  }
  // expression is passed literally
  // expression is evaluated at every use within


  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

}
