// Solution-1.scala

// 1. Write code to pair people up to do exercises in a programming
// seminar. Take the list of attendees and split it into two lists. Use
// zip to create the pairs. Satisfy the following tests:
// val people = Vector("Sally Smith",
//  "Dan Jones", "Tom Brown", "Betsy Blanc",
//  "Stormy Morgan", "Hal Goodsen")
// val group1 = // fill this in
// val group2 = // fill this in
// val pairs = // fill this in
// pairs is Vector(
//  ("Sally Smith","Betsy Blanc"),
//  ("Dan Jones","Stormy Morgan"),
//  ("Tom Brown","Hal Goodsen"))

import com.atomicscala.AtomicTest._

val people = Vector("Sally Smith",
    "Dan Jones", "Tom Brown", "Betsy Blanc",
    "Stormy Morgan", "Hal Goodsen")

val group1 = people.take(3)
val group2 = people.takeRight(3)
val pairs = group1.zip(group2)

pairs is Vector(
    ("Sally Smith","Betsy Blanc"),
    ("Dan Jones","Stormy Morgan"),
    ("Tom Brown","Hal Goodsen"))