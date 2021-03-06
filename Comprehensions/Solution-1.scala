// Solution-1.scala

// 1. Change yielding to a more descriptive name. 
 
import com.atomicscala.AtomicTest._

def oddLT10(v: Vector[Int]): Vector[Int] = {
    val result = for {
        n <- v
        if n < 10
        if n % 2 != 0
    } yield n
    result
}

val v = Vector(1, 2, 3, 5, 6, 7, 8, 10, 13, 14, 17)
oddLT10(v) is Vector(1, 3, 5, 7) 