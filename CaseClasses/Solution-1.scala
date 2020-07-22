// Solution-1.scala

// 1. Create a case class to represent a Person in an address book,
// complete with Strings for the name and a String for contact
// information. Satisfy the following tests:
// val p = Person("Jane", "Smile",
// "jane@smile.com")
// p.first is "Jane"
// p.last is "Smile"
// p.email is "jane@smile.com"
 
import com.atomicscala.AtomicTest._

case class Person(first: String, last: String, email: String)

val p = Person("Jane", "Smile", "jane@smile.com")
p.first is "Jane"
p.last is "Smile"
p.email is "jane@smile.com"