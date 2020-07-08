// Solution-4.scala

// 4. That last space is unexpected. Use String’s replace method to
// replace “firehouse ” with “firehouse!” Satisfy the following test:
// theString is
//  "The dog visited the firehouse!"

import com.atomicscala.AtomicTest._

val words = Vector("The ", "dog ", "visited ", "the ", "firehouse ")
var sentence = ""

for (i <- words) sentence += i
val theString = sentence.toString().replace("firehouse ", "firehouse!")

theString is "The dog visited the firehouse!"