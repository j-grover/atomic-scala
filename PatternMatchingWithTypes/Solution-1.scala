// Solution-1.scala

// 1. Create a method plus1 that pluralizes a String, adds 1 to an Int,
// and adds “+ guest” to a Person. Satisfy the following tests:
// plus1("car") is "cars"
// plus1(67) is 68
// plus1(Person("Joanna")) is
//  "Person(Joanna) + guest"

import com.atomicscala.AtomicTest._

case class Person(name: String)

def plus1(x: Any): Any = {
    x match {
        case s: String  => s"${s}s"
        case i: Int     => i + 1
        case p: Person  => s"$p + guest"
    }
}

plus1("car") is "cars"
plus1(67) is 68
plus1(Person("Joanna")) is "Person(Joanna) + guest"
 