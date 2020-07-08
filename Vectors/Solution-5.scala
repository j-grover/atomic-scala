// Solution-5.scala

// 5. Building from your solution for Exercise 4, write a for loop that
// prints each word, reversed. Your output should match:
// /* Output:
// ehT
// god
// detisiv
// eht
// esuoherif
// */

import com.atomicscala.AtomicTest._

val words = Vector("The ", "dog ", "visited ", "the ", "firehouse ")

for (i <- words) println(i.reverse)