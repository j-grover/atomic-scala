// Solution-3.scala

// 3. Rewrite the solution for the previous exercise using for. Was this
// more or less complex than using map? Which approach has the
// greater potential for errors? 

import com.atomicscala.AtomicTest._

val v = Vector(1, 2, 3, 4)
v.foreach(x => x * 11 + 10) is Vector(21, 32, 43, 54)

// As Vector is immutable, the above approach is a better option