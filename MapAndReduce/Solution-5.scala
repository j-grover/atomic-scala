// Solution-5.scala

// 5. Rewrite Reduce.scala using for loops. 

import com.atomicscala.AtomicTest._

val v = Vector(1, 10, 100, 1000)
var sum = 0

for (x <- v) {
    sum += x
}

sum is 1111