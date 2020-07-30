// Solution-4.scala

// 4. Confirm that you can’t modify n or isOdd in yielding3. Declare
// them as vars. What happened? Did you find a way to do this? Did
// it make sense to you? 

import com.atomicscala.AtomicTest._

def yielding3(v: Vector[Int]): Vector[Int] = {
    var n = 0
    var isOdd = false
    val result = for {
        n <- v
        if n < 10
        isOdd = n % 2 != 0
        if (isOdd)
    } yield {
        val u = n * 10
        u + 2
    }
    result
}

val v = Vector(1, 2, 3, 5, 6, 7, 8, 10, 13, 14, 17)
yielding3(v) is Vector(12, 32, 52, 72) 