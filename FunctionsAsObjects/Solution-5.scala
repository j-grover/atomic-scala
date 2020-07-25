// Solution-5.scala

// 5. Repeat Exercise 4 without using the dogYears method:
// var s = ""
// val v = Vector(1, 5, 7, 8)
// v.foreach(/* Fill this in */)
// s is "7 35 49 56 "

import com.atomicscala.AtomicTest._

var s = ""
val v = Vector(1, 5, 7, 8)
v.foreach((years: Int) => s += years * 7 + " ")
s is "7 35 49 56 "