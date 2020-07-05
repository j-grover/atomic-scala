// Solution-1.scala

// 1. Rename the package pythagorean using the reverse domain-name
// standard described above. Build it with scalac, following the
// previously described steps, and ensure that a directory hierarchy is
// created on your computer to hold these classes. Revise
// ImportPythagorean.scala, above, and save as Solution-1.scala.
// Remember to update the package import to use your new class.
// Ensure that the tests run properly. 

import com.atomicscala.pythagorean.RightTriangle

val rt = new RightTriangle
println(rt.hypotenuse(3,4))
println(rt.area(3,4))
assert(rt.hypotenuse(3,4) == 5)
assert(rt.area(3,4) == 6) 

/* Results in:
5.0
6.0
*/