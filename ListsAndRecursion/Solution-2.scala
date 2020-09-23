// Solution-2.scala

// 2. Add println statements to RecursiveSum.scala to trace what
// happens during recursion. 

import com.atomicscala.AtomicTest._

def sumIt(toSum: List[Int], sum: Int = 0): Int =
    if (toSum.isEmpty)
        sum
    else {
        println(s"Sum: $sum List: ${toSum.tail}")
        sumIt(toSum.tail, sum + toSum.head)
    }

sumIt(List(10, 20, 30, 40, 50)) is 150