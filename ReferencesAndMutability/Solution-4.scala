// Solution-4.scala

// 4. Vector doesn’t have a mutable equivalent. How do you change the
// contents of a Vector?  

import com.atomicscala.AtomicTest._

var v = Vector("a", "b")
v +:= "c"
v is Vector("c", "a", "b")