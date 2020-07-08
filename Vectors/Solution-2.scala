// Solution-2.scala

// 2. Use the REPL to see if you can make a Vector containing other
// Vectors. How can you use such a thing? 

val v1 = Vector(Vector(1, 2), Vector(3.0, 4.0))

/* Results in REPL:
scala> val v1 = Vector(Vector(1, 2), Vector(3.0, 4.0))
val v1: scala.collection.immutable.Vector[scala.collection.immutable.Vector[AnyVal]] = Vector(Vector(1, 2), Vector(3.0, 4.0))

Can be used to store vectors with different data types in a single vector.
*/