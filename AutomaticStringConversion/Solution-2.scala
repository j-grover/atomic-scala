// Solution-2.scala

// 2. Build on the previous exercise to show that the toString method
// can be more complex than a single-line method.
// A) Change the class name to Cycle and pass the number of wheels
// as a class argument when you create the object. 
// B) Use pattern matching to display “Unicycle” for a single wheeled
// cycle, “Bicycle” for 2 wheels, “Tricycle” for 3 wheels, “Quadricycle”
// for 4 wheels, and “Cycle with n wheels” for numbers greater than
// 4, replacing “n” with the argument. Satisfy the following tests:
// val c1 = Cycle(1)
// c1 is "Unicycle"
// val c2 = Cycle(2)
// c2 is "Bicycle"
// val cn = Cycle(5)
// cn is "Cycle with 5 wheels"

import com.atomicscala.AtomicTest._

case class Cycle(wheels: Int) {
    override def toString =
        wheels match {
            case 1  => "Unicycle"
            case 2  => "Bicycle"
            case 3  => "Tricycle"
            case _  => s"Cycle with $wheels wheels"
        }
}

val c1 = Cycle(1)
c1 is "Unicycle"

val c2 = Cycle(2)
c2 is "Bicycle"

val cn = Cycle(5)
cn is "Cycle with 5 wheels"