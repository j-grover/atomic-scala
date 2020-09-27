// Solution-2.scala

// 2. Maps store information using unique keys. An email address can
// serve as a unique key. Create a class Name containing firstName
// and lastName. Create a Map that associates emailAddress (a
// String) with Name. Satisfy the following test:
// val m = Map("sally@taylor.com"
//  -> Name("Sally","Taylor"))
// m("sally@taylor.com") is
//  Name("Sally", "Taylor")

import com.atomicscala.AtomicTest._

case class Name(firstName: String, lastName: String)

val m = Map("sally@taylor.com" -> Name("Sally", "Taylor"))
m("sally@taylor.com") is Name("Sally", "Taylor")