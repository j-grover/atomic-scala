// Solution-2.scala

// 2. What happens when the initial list is an odd number, so the
// groups split into uneven sizes? Try it.  

import com.atomicscala.AtomicTest._

val people = Vector("Sally Smith",
    "Dan Jones", "Tom Brown", "Betsy Blanc",
    "Stormy Morgan", "Hal Goodsen", "Extra Person")

val group1 = people.take(4)
val group2 = people.takeRight(3)
val pairs = group1.zip(group2)

// If group1 has an extra person, Betsy Blanc is left out
// If group2 has an extra person, Extra Person is left out