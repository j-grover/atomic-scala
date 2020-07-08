// Solution-6.scala

// 6. Write a for loop that prints the words from Exercise 4 in reverse
// order (last word first, etc.). Your output should match:
// /* Output:
// firehouse
// the
// visited
// dog
// The
// */ 

import com.atomicscala.AtomicTest._

val words = Vector("The ", "dog ", "visited ", "the ", "firehouse ")

for (i <- words.reverse) println(i)