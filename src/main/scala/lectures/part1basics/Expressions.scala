package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2 // EXPRESSION
  println(x)

  // Instruction (DO) vs Expressions (VALUE)

  // IF expression
  val aCondition = true
  val aConditionedValue = if (aCondition) 5 else 3 // IF EXPRESSION
  println(aConditionedValue)
  println(if (aCondition) 5 else 3)

  // Everything in Scala is an Expression!

  // instruction are executed (think Java), expressions are evaluated (Scala)

  // Do NOT use while loops in your Scala code or I'll haunt you

  // the value of the block is the value of its last expression
  val someValue = {
    2 < 3
  }

  val someOtherValue = {
    if (someValue) 239 else 986
    42
  }
  println(someOtherValue)



}
