// Solution-6.scala

// 6. Sort in a different way than in the previous example. Use the first
// name as your primary sort key and the last name as your tie
// breaker. Satisfy the following test:
// val friends3 = Vector(
//  new Friend(
//  "Zach", "Smith", "zach@smith.com"),
//  new Friend(
//  "Mary", "Add", "mary@add.com"),
//  new Friend(
//  "Sally","Taylor","sally@taylor.com"),
//  new Friend(
//  "Mary", "Smith", "mary@smith.com") )
// val s3 = // call first sort here
// val s4 = // sort s1 here
// s4 is "Vector(Mary Add, Mary Smith, " +
// "Sally Taylor, Zach Smith)"

import com.atomicscala.AtomicTest._

case class Person(first: String, last: String) {
    override def toString = s"$first $last"
}

trait Contact {
    val email: String
}

class Friend(first: String, last: String, val email: String) extends
    Person(first, last) with Contact

val friends3 = Vector(
    new Friend("Zach", "Smith", "zach@smith.com"),
    new Friend("Mary", "Add", "mary@add.com"),
    new Friend("Sally","Taylor","sally@taylor.com"),
    new Friend("Mary", "Smith", "mary@smith.com") )

val s3 = friends3.sortBy(_.last)
val s4 = s3.sortBy(_.first)

s4 is "Vector(Mary Add, Mary Smith, Sally Taylor, Zach Smith)"