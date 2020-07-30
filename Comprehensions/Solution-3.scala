// Solution-3.scala

// 3. Start with yielding3 and rewrite the comprehension so it is as
// compact as possible (reduce isOdd and the yield clause). Now
// assign the comprehension to an explicitly-typed value called
// result, and return result at the end of the method. Continue to
// satisfy the existing tests in Yielding3.scala 

import com.atomicscala.AtomicTest._

def yielding3(v: Vector[Int]): Vector[Int] = {
    val result = for {
        n <- v
        if (n < 10 && n % 2 != 0)
    } yield n * 10 + 2
    result
}

val v = Vector(1, 2, 3, 5, 6, 7, 8, 10, 13, 14, 17)
yielding3(v) is Vector(12, 32, 52, 72) 