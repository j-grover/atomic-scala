// Solution-1.scala

// 1. Create a case class that represents a Person in an address book,
// complete with name and email address. Satisfy the following tests: 
// val p = Person("John", "Smith",
//  "john@smith.com")
// p.fullName is "John Smith"
// p.first is "John"
// p.email is "john@smith.com"

import com.atomicscala.AtomicTest._

case class Person(first: String, last: String, email: String) {
    val fullName = s"$first $last"
}

val p = Person("John", "Smith", "john@smith.com")
p.fullName is "John Smith"
p.first is "John"
p.email is "john@smith.com"