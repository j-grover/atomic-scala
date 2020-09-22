// Solution-5.scala

// 5. What if you want to sort on a primary field (e.g., last name) and
// resolve any “ties” with a secondary field (e.g., first name)? Hint:
// sortBy is “stable” so if you sort the list first by the tiebreaker and
// then by the primary field, you accomplish the goal. Satisfy:
// val friends2 = Vector(
//  new Friend(
//  "Zach", "Smith", "zach@smith.com"),
//  new Friend(
//  "Mary", "Add", "mary@add.com"),
//  new Friend(
//  "Sally","Taylor","sally@taylor.com"),
//  new Friend(
//  "Mary", "Smith", "mary@smith.com"))
// val s1 = // call first sort here
// val s2 = // sort s1 here
// s2 is "Vector(Mary Add, Mary Smith, " +
// "Zach Smith, Sally Taylor)"

import com.atomicscala.AtomicTest._

case class Person(first: String, last: String) {
    override def toString = s"$first $last"
}

trait Contact {
    val email: String
}

class Friend(first: String, last: String, val email: String) extends
    Person(first, last) with Contact

val friends2 = Vector(
    new Friend("Zach", "Smith", "zach@smith.com"),
    new Friend("Mary", "Add", "mary@add.com"),
    new Friend("Sally","Taylor","sally@taylor.com"),
    new Friend("Mary", "Smith", "mary@smith.com"))

val s1 = friends2.sortBy(_.first)
val s2 = s1.sortBy(_.last)

s2 is "Vector(Mary Add, Mary Smith, Zach Smith, Sally Taylor)"