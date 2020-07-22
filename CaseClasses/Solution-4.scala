// Solution-4.scala

// 4. As in Class Exercises, make a case class Dimension that has an
// integer field height and an integer field width that can be both
// retrieved and modified from outside of the class. Create and print
// an object of this class. How does this solution differ from your
// solution for Exercise 1 in Class Exercises? Satisfy the following
// tests:
// val c = new Dimension(5,7)
// c.height is 5
// c.height = 10
// c.height is 10
// c.width = 19
// c.width is 19

import com.atomicscala.AtomicTest._

case class Dimension(var height: Int, var width: Int)

val c = new Dimension(5, 7)
c.height is 5
c.height = 10
c.height is 10
c.width = 19
c.width is 19

// Differs from rest as requires class fields to be var instead of val