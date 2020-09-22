// Solution-2.scala

// 2. Create three Person objects and put them in a Vector named
// people. Satisfy the following test: people.size is 3

import com.atomicscala.AtomicTest._

case class Person(first: String, last: String, email: String) {
    val fullName = s"$first $last"
}

val p1 = Person("Bob", "Adams", "bob@gmail.com")
val p2 = Person("Steve", "John", "steve@gmail.com")
val p3 = Person("Tom", "Smith", "tom@gmail.com")

val people = Vector(p1, p2, p3)
people.size is 3