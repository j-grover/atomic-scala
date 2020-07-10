// Solution-2.scala

// 2. Create a Vector containing all the Vectors from Exercise 1. Write a
// for loop within a for loop to move through this Vector of Vectors
// and append all the elements to a single String. 

import com.atomicscala.AtomicTest._

val chars = Vector('a', 'c', 'b')
val ints = Vector(5, 3, 3)
val strings = Vector("a", "dd", "c")

val v1 = Vector(chars, ints, strings)
var singleString = ""

for (i <- v1) 
    for (j <- i)
        singleString += j + " "

singleString is "a c b 5 3 3 a dd c "