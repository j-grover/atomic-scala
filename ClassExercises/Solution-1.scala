// Solution-1.scala

// 1. Make a class Dimension that has an integer field height and an
// integer field width that can be both retrieved and modified from
// outside the class. Satisfy the following tests:
// val c = new Dimension(5,7)
// c.height is 5
// c.height = 10
// c.height is 10
// c.width = 19
// c.width is 19
 
import com.atomicscala.AtomicTest._

class Dimension(var height: Int, var width: Int)

val c = new Dimension(5,7)
c.height is 5
c.height = 10
c.height is 10
c.width = 19
c.width is 19