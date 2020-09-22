// Solution-3.scala

// 3. Sort the Vector of Person objects by last name to produce a sorted
// Vector. Hint: Use sortBy(_.fieldname), where fieldname is the field
// that you want to sort by. Satisfy the following tests:
// val people = Vector(
// Person("Zach","Smith","zach@smith.com"),
// Person("Mary", "Add", "mary@add.com"),
// Person("Sally", "Taylor",
//  "sally@taylor.com"))
// val sorted = // call sort here
// sorted is "Vector(" +
// + "Person(Mary,Add,mary@add.com)," +
// + "Person(Zach,Smith,zach@smith.com)," +
// + "Person(Sally,Taylor,sally@taylor.com))"

import com.atomicscala.AtomicTest._

case class Person(first: String, last: String, email: String) {
    val fullName = s"$first $last"
}

val people = Vector(
    Person("Zach", "Smith", "zach@smith.com"),
    Person("Mary", "Add", "mary@add.com"),
    Person("Sally", "Taylor", "sally@taylor.com"))

val sorted = people.sortBy(_.last)
sorted is "Vector(" +
    "Person(Mary,Add,mary@add.com), " +
    "Person(Zach,Smith,zach@smith.com), " +
    "Person(Sally,Taylor,sally@taylor.com))"
