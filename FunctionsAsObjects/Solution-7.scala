// Solution-7.scala

// 7. Create an anonymous function to square a list of numbers. Call the
// function for every element in a Vector, using foreach. Satisfy the 
// following test:
// var s = ""
// val numbers = Vector(1, 2, 5, 3, 7)
// numbers.foreach(/* Fill this in */)
// s is "1 4 25 9 49 "

import com.atomicscala.AtomicTest._

var s = ""
val numbers = Vector(1, 2, 5, 3, 7)
numbers.foreach((x: Int) => s += x * x + " ")
s is "1 4 25 9 49 "
