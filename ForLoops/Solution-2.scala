// Solution-2.scala

// 2. Use Range.inclusive to solve the problem above. What changed? 

import com.atomicscala.AtomicTest._

val r1 = Range(0, 10).inclusive
r1 is Range(0, 11)

// Range is "0 to 10" this time instead of "0 until 10"