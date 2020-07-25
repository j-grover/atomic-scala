// Solution-2.scala

// 2. Working from your solution to the exercise above, add a comma
// between each number. Satisfy the following test:
// str is "1,2,3,4,"

import com.atomicscala.AtomicTest._

val v = Vector(1, 2, 3, 4)
var str = ""
v.foreach(n => str += n + ",")

str is "1,2,3,4,"