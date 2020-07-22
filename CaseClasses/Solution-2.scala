// Solution-2.scala

// 2. Create some Person objects. Put the Person objects in a Vector.
// Satisfy the following tests:
// val people = Vector(
// Person("Jane","Smile","jane@smile.com"),
// Person("Ron","House","ron@house.com"),
// Person("Sally","Dove","sally@dove.com"))
// people(0) is
// "Person(Jane,Smile,jane@smile.com)" 
// people(1) is
// "Person(Ron,House,ron@house.com)"
// people(2) is
// "Person(Sally,Dove,sally@dove.com)"

import com.atomicscala.AtomicTest._

case class Person(first: String, last: String, email: String)

val people = Vector(
    Person("Jane", "Smile", "jane@smile.com"),
    Person("Ron", "House", "ron@house.com"),
    Person("Sally", "Dove", "sally@dove.com"))

people(0) is "Person(Jane,Smile,jane@smile.com)"
people(1) is "Person(Ron,House,ron@house.com)"
people(2) is "Person(Sally,Dove,sally@dove.com)"