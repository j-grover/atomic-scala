// Solution-3.scala

// 3. In the REPL, create a single Vector containing a Char, an Int, a
// String and a Double. What type does this Vector contain? Try to
// find the max of your Vector. Does this make sense? 

import com.atomicscala.AtomicTest._

/* Results in REPL:
scala> val v1 = Vector('a', 1, "aa", 1.0)
val v1: scala.collection.immutable.Vector[Any] = Vector(a, 1, aa, 1.0)

The type is "Any"

scala> v1.max
          ^
       error: No implicit Ordering defined for Any.

Applying max does not make sense as types are different
*/