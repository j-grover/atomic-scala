// Solution-4.scala

// 4. Move the email address to a Contact trait, and mix that in to create
// a new class Friend. Add Friend objects to a Vector. Sort on the
// email address. Satisfy the following (this may require refactoring):
// val friends = Vector(
//  new Friend(
//  "Zach", "Smith", "zach@smith.com"),
//  new Friend(
//  "Mary", "Add", "mary@add.com"),
//  new Friend(
//  "Sally","Taylor","sally@taylor.com"))
// val sorted = // call sort here
// sorted is "Vector(Mary Add, " +
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

val friends = Vector(
    new Friend("Zach", "Smith", "zach@smith.com"),
    new Friend("Mary", "Add", "mary@add.com"),
    new Friend("Sally","Taylor","sally@taylor.com"))

val sorted = friends.sortBy(_.email)
sorted is "Vector(Mary Add, Sally Taylor, Zach Smith)"