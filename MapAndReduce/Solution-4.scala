// Solution-4.scala

// 4. Rewrite SimpleMap.scala using a for loop instead of map, and
// observe the additional complexity this introduces. 

import com.atomicscala.AtomicTest._

val v = Vector(1, 2, 3, 4)
v.foreach(x => x * 11 + 10) is Vector(21, 32, 43, 54)

// As Vector is immutable, the above approach is a better option