// Solution-1.scala

// 1. Override toString in a case class. Modify Bicycle so its toString
// produces “Bicycle built for 2.” Satisfy the following test:
// val forTwo = Bicycle(2)
// forTwo is "Bicycle built for 2"

import com.atomicscala.AtomicTest._

case class Bicycle(riders: Int) {
    override def toString =
        s"Bicycle built for $riders"
}

val forTwo = Bicycle(2)
forTwo is "Bicycle built for 2"