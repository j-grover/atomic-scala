// Solution-10.scala

// 10. List and Set are similar to Vector. Use the REPL to discover their
// operations and compare them to those of Vector. 

/* Results in REPL:

----- Vector
scala> val v1 = Vector(1, 2, 3, 2)
val v1: scala.collection.immutable.Vector[Int] = Vector(1, 2, 3, 2)

scala> v1.min
val res0: Int = 1

scala> v1.max
val res1: Int = 3

scala> v1.sum
val res2: Int = 8

----- List 
scala> val l1 = List(1, 2, 3, 2)
val l1: List[Int] = List(1, 2, 3, 2)

scala> l1.min
val res3: Int = 1

scala> l1.max
val res4: Int = 3

scala> l1.sum
val res5: Int = 8

----- Set
scala> val s1 = Set(1, 2, 3, 2)
val s1: scala.collection.immutable.Set[Int] = Set(1, 2, 3)

scala> s1.min
val res6: Int = 1

scala> s1.max
val res7: Int = 3

scala> s1.sum
val res8: Int = 6

List, Vector and Set all allow min, max and sum but Set does not contain
duplicates
*/