// Solution-3.scala

// 3. Create a class Cycle that has a field for wheels set to 2, and a
// method ride that returns “Riding.” Create a derived class Bicycle
// that inherits from Cycle. Satisfy the following tests:
// val c = new Cycle
// c.ride is "Riding"
// val b = new Bicycle
// b.ride is "Riding"
// b.wheels is 2 

import com.atomicscala.AtomicTest._

class Cycle {
    val wheels = 2

    def ride = "Riding"
}

class Bicycle extends Cycle

val c = new Cycle
c.ride is "Riding"

val b = new Bicycle
b.ride is "Riding"
b.wheels is 2 