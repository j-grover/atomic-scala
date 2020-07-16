// Solution-6.scala

// 6. Fields contained a class Cup2 with a field percentFull. Rewrite that
// class definition, using a class argument instead of defining a field. 

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