// Solution-4.scala

// 4. Write methods that allow you to both set and get the value of
// percentFull. Satisfy the following:
// val cup4 = new Cup4
// cup4.set(56)
// cup4.get() is 56

import com.atomicscala.AtomicTest._

class Cup4 {
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

    def set(value: Int): Unit = percentFull = value

    def get(): Int = percentFull
}

val cup4 = new Cup4
cup4.set(56)
cup4.get() is 56