// Solution-3.scala

// 3. Create a Vector and populate it with words (which are Strings).
// Add a for loop that prints each element in the Vector. Now append
// to a var String to create a sentence. Satisfy the following test:
// sentence.toString() is
//  "The dog visited the firehouse "

import com.atomicscala.AtomicTest._

val words = Vector("The ", "dog ", "visited ", "the ", "firehouse ")
var sentence = ""

for (i <- words) sentence += i
sentence.toString() is "The dog visited the firehouse "