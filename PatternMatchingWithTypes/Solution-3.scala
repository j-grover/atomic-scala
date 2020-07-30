// Solution-3.scala

// 3. Modify convertToSize from the previous exercise so it returns an
// Int. Use the scala.math.round method to round the Double first.
// Did you need to declare the return type? Do you see an advantage
// to doing so? Satisfy the following tests:
// convertToSize2(45) is 45
// convertToSize2("car") is 3
// convertToSize2("truck") is 5
// convertToSize2(Person("Joanna")) is 1
// convertToSize2(45.6F) is 46
// convertToSize2(Vector(1, 2, 3)) is 0

import com.atomicscala.AtomicTest._

case class Person(name: String)

def convertToSize2(x: Any) = {
    x match {
        case s: String  => s.length
        case i: Int     => i 
        case f: Float   => f.round
        case p: Person  => 1
        case _          => 0
    }
} 

convertToSize2(45) is 45
convertToSize2("car") is 3
convertToSize2("truck") is 5
convertToSize2(Person("Joanna")) is 1
convertToSize2(45.6F) is 46
convertToSize2(Vector(1, 2, 3)) is 0

// Return type did not have to be declared