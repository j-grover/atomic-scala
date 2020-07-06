// Solution-1.scala

// 1. What happens in Cup2’s add method if increase is a negative
// value? Is any additional code necessary to satisfy the following
// tests:
// val cup2 = new Cup2
// cup2.add(45) is 45
// cup2.add(-15) is 30
// cup2.add(-50) is -20

import com.atomicscala.AtomicTest._

class Cup2 {
    var percentFull = 0
    val max = 100
    def add(increase: Int): Int = {
        percentFull += increase
        if (percentFull > max) {
            percentFull = max
        }
        percentFull
    }
}

val cup2 = new Cup2
cup2.add(45) is 45
cup2.add(-15) is 30
cup2.add(-50) is -20

// No addtional code necessary, all tests pass