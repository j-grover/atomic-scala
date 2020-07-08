// Solution-1.scala

// 1. Use the REPL to create several Vectors, each populated by a
// different type of data. See how the REPL responds and guess what
// it means.

val v1 = Vector(1, 2, 3, 4)
val v2 = Vector(1.0, 2.0, 3.0, 4.0)
val v3 = Vector("1", "2", "3", "4")

/* Results in REPL:
scala> val v1 = Vector(1, 2, 3, 4)
val v1: scala.collection.immutable.Vector[Int] = Vector(1, 2, 3, 4)

scala> val v2 = Vector(1.0, 2.0, 3.0, 4.0)
val v2: scala.collection.immutable.Vector[Double] = Vector(1.0, 2.0, 3.0, 4.0)

scala> val v3 = Vector("1", "2", "3", "4")
val v3: scala.collection.immutable.Vector[String] = Vector(1, 2, 3, 4)
*/