// Solution-2.scala

// 2. Create a method convertToSize that converts a String to its length,
// uses Int and Double directly, and converts a Person to 1. Return 0 if
// you don’t have a matching type. What was the return type of your
// method? Satisfy the following tests:
// convertToSize(45) is 45
// convertToSize("car") is 3
// convertToSize("truck") is 5
// convertToSize(Person("Joanna")) is 1 
// convertToSize(45.6F) is 45.6F
// convertToSize(Vector(1, 2, 3)) is 0

import com.atomicscala.AtomicTest._

case class Person(name: String)

def convertToSize(x: Any): Any = {
    x match {
        case s: String  => s.length
        case i: Int     => i 
        case f: Float   => f
        case p: Person  => 1
        case _          => 0
    }
} 

convertToSize(45) is 45
convertToSize("car") is 3
convertToSize("truck") is 5
convertToSize(Person("Joanna")) is 1 
convertToSize(45.6F) is 45.6F
convertToSize(Vector(1, 2, 3)) is 0

// Return type of method was Any