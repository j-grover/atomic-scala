// Solution-3.scala

// 3. First, create a case class that represents a Dog, using a String for
// name and a String for breed. Then, create a Vector of Dogs. Satisfy
// the following tests:
// val dogs = Vector(
//  /* Insert Vector initialization */
//  )
// dogs(0) is "Dog(Fido,Golden Lab)"
// dogs(1) is "Dog(Ruff,Alaskan Malamute)"
// dogs(2) is "Dog(Fifi,Miniature Poodle)"

import com.atomicscala.AtomicTest._

case class Dog(name: String, breed: String)

val dogs = Vector(
    Dog("Fido", "Golden Lab"),
    Dog("Ruff", "Alaskan Malamute"),
    Dog("Fifi", "Miniature Poodle"))

dogs(0) is "Dog(Fido,Golden Lab)"
dogs(1) is "Dog(Ruff,Alaskan Malamute)"
dogs(2) is "Dog(Fifi,Miniature Poodle)"
