// Solution-12.scala

// 12. Create two Vectors of Int named myVector1 and myVector2, each
// initialized to 1, 2, 3, 4, 5, 6. Use AtomicTest to show whether they
// are equivalent.

import com.atomicscala.AtomicTest._

val myVector1 = (1, 2, 3, 4, 5, 6)
val myVector2 = (1, 2, 3, 4, 5, 6)

myVector1 is myVector2