// Solution-2.scala

// 2. Add another class EquilateralTriangle to your solution for Exercise
// 1. Create a method area with an argument side (as a Double); look
// up the formula in Wikipedia. Display a test result and use assert to
// verify it.

import com.atomicscala.pythagorean.EquilateralTriangle

val et = new EquilateralTriangle
println(et.area(2.5))
assert(et.area(2.5) == 2.7063293868263707)