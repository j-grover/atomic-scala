// Solution-1.scala

// 1. Under what conditions does a Vector of length greater than one
// equal its reverse? 

import com.atomicscala.AtomicTest._

// When the vector is a "palindrome"

val v1 = Vector(1, 2, 3, 2, 1)
v1 is v1.reverse