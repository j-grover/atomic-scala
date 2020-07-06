// Solution-3.scala

// 3. Can you set percentFull from outside the class? Try it, like this:
// cup3.percentFull = 56
// cup3.percentFull is 56

import com.atomicscala.AtomicTest._

class Cup3 {
    var percentFull = 0
    val max = 100
    def add(increase: Int): Int = {
        percentFull += increase
        if (percentFull > max) {
            percentFull = max
        } else if (percentFull < 0) {
            percentFull = 0
        }
        percentFull
    }
}

val cup3 = new Cup3
cup3.percentFull = 56
cup3.percentFull is 56

// Yes, percentFull can be set from outside the class