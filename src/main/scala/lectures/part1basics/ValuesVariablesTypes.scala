package lectures.part1basics

object ValuesVariablesTypes extends App {

  val x: Int = 42
  println(x)

  // VALS ARE IMMUTABLE = can't be reassigned

  // COMPILER can infer types

  val aString: String = "hello"
  val anotherString = "good bye"

  val aBoolean: Boolean = true
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4316
  val aLong: Long = 28731289918429L
  val aFloat: Float = 2.9f
  val aDouble: Double = 3.14

  // variables
  var aVariable: Int = 4

  aVariable = 5 // side effects -> mutable

  // prefer vals over vars
  // all vals and vars have types
  // compiler automatically infers types when omitted
}
