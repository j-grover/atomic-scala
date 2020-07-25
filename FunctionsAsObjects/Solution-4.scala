// Solution-4.scala

// 4. Create a Vector and append the result of dogYears to a String for
// each value in the Vector. Satisfy the following test:
// var s = ""
// val v = Vector(1, 5, 7, 8)
// v.foreach(/* Fill this in */)
// s is "7 35 49 56 "

import com.atomicscala.AtomicTest._

val dogYears = (years: Int) => s += years * 7 + " "

var s = ""
val v = Vector(1, 5, 7, 8)
v.foreach(dogYears)
s is "7 35 49 56 "