// Solution-3.scala

// 3. Add to the previous exercise. For a negative number of wheels,
// satisfy the following test:
// Cycle(-2) is "That's not a cycle!"

import com.atomicscala.AtomicTest._

case class Cycle(wheels: Int) {
    override def toString =
        wheels match {
            case n: Int if (n < 0)  => "That's not a cycle!"
            case 1                  => "Unicycle"
            case 2                  => "Bicycle"
            case 3                  => "Tricycle"
            case _                  => s"Cycle with $wheels wheels"
        }
}

Cycle(-2) is "That's not a cycle!"