// Solution-7.scala

// 7. Case classes can be used as keys for Maps. Create a class for
// Person(name:String). Create a mapping of Person to String. Remove
// the case keyword and see what error message(s) you get. Fix it and
// satisfy the following test:
// m(Person("Janice")) is "CFO"

import com.atomicscala.AtomicTest._

case class Person(name: String)

val m = Map(Person("Janice") -> "CFO")

m(Person("Janice")) is "CFO"

// Without the case keyword, value Person is not found