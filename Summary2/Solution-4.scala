// Solution-4.scala

// 4. Modify BasicMethods.scala so the two methods are part of a class.
// Put the class in a package and compile it. Import the resulting
// library into a script and test it.

import com.atomicscala.AtomicTest._
import com.atomicscala.Methods._

val method = new BasicMethods
method.cube(3) is 27
method.bang("pop") is "pop!"