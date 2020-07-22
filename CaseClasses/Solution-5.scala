// Solution-5.scala

// 5. Modify your solution for Exercise 4, using one ordinary (val)
// argument for height and one var argument for width. Demonstrate
// that one is read-only and the other is modifiable.  

import com.atomicscala.AtomicTest._

case class Dimension(val height: Int, var width: Int)

val c = new Dimension(5, 7)
c.height is 5
// c.height = 10
// c.height is 10
c.width = 19
c.width is 19

// Trying to modify height throws an error