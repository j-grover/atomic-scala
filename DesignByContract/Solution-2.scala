// Solution-2.scala

// 2. Write an App (see Applications) with a method that takes the
// command-line argument of a String of letters, converts it to
// lowercase, and then converts each character to its numerical value
// in the alphabet, with ‘a’ being 1, ‘b’ being 2, etc. Sum the values
// and display the result. Use preconditions to verify that the input is
// in the correct form, and postconditions to ensure that the result is
// in the expected range of values.    

import com.atomicscala.AtomicTest._

object LettersToNumber extends App {
  def letterToNumber(input: String) = {
    require(input.forall(_.isLetter), "String must contain letters only")
    var result = input.toLowerCase.map(_.asDigit - 9).sum
    assume(result >= input.length * 1, s"Min should be >= ${input.length * 1}")
    assume(result <= input.length * 26, s"Min should be >= ${input.length * 26}")
    println(result)
  }

  try {
      letterToNumber(args(0))
  } catch {
      case e: Throwable => println(e.getMessage)
  }
}