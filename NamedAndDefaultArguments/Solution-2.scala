// Solution-2.scala

// 2. Using the solution for SimpleTime above, default minutes to 0 so
// you don’t have to specify them. Satisfy the following tests:
// val t2 = new SimpleTime2(hours=10)
// t2.hours is 10
// t2.minutes is 0

import com.atomicscala.AtomicTest._

class SimpleTime2(val hours: Int, val minutes: Int = 0)

val t2 = new SimpleTime2(hours=10)
t2.hours is 10
t2.minutes is 0