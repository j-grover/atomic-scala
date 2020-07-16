// Solution-7.scala

// 7. Using your solution for Exercise 6, can you get and set the value of
// percentFull without writing any new methods? Try it!  

import com.atomicscala.AtomicTest._

class Cup2(var percentFull: Int) {
  val max = 100
  def add(increase: Int): Int = {
    percentFull += increase
    if (percentFull > max) {
      percentFull = max
    }
    percentFull 
  }
}

val cup = new Cup2(0)
cup.add(50) is 50
cup.add(70) is 100
cup.percentFull = 20
cup.percentFull is 20

/* Results in:
50
100
20
*/