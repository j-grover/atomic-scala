// Solution-2.scala

// 2. Can you replace map with foreach in the above solution? What
// happens? Test the result

import com.atomicscala.AtomicTest._

val v = Vector(1, 2, 3, 4)
v.foreach(x => x * 11 + 10) is Vector(21, 32, 43, 54)

// Fails test, return value is ()