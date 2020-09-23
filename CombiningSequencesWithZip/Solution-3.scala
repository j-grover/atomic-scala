// Solution-3.scala

// 3. Repeat Exercise 1 using a List instead of a Vector. Did you have to
// make any other modifications?

import com.atomicscala.AtomicTest._

val people = List("Sally Smith",
    "Dan Jones", "Tom Brown", "Betsy Blanc",
    "Stormy Morgan", "Hal Goodsen")

val group1 = people.take(3)
val group2 = people.takeRight(3)
val pairs = group1.zip(group2)

pairs is List(
    ("Sally Smith","Betsy Blanc"),
    ("Dan Jones","Stormy Morgan"),
    ("Tom Brown","Hal Goodsen"))

// No modifications required for List