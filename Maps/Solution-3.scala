// Solution-3.scala

// 3. Adding to your solution for the previous exercise, add Jiminy
// Cricket to the existing map, where the email address is
// “jiminy@cricket.com.” Satisfy the following tests:
// m2("jiminy@cricket.com") is
// Name("Jiminy", "Cricket")
// m2("sally@taylor.com") is
// Name("Sally", "Taylor")

import com.atomicscala.AtomicTest._

case class Name(firstName: String, lastName: String)

val m2 = Map("sally@taylor.com" -> Name("Sally", "Taylor"),
             "jiminy@cricket.com" -> Name("Jiminy", "Cricket"))

m2("jiminy@cricket.com") is Name("Jiminy", "Cricket")
m2("sally@taylor.com") is Name("Sally", "Taylor")