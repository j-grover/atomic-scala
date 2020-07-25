// Solution-3.scala

// 3. Building on the previous exercise, change explicit to return a Set.
// Satisfy the following tests:
// explicitSet(Vector(10.0, 20.0, 10.0)) is
// Set(10.0, 20.0)
// explicitSet(Vector(1, 2, 3, 2, 3, 4)) is
// Set(1.0, 2.0, 3.0, 4.0)

import com.atomicscala.AtomicTest._

def explicitSet(v: Vector[Double]) = {
    v.toSet
}

explicitSet(Vector(10.0, 20.0, 10.0)) is Set(10.0, 20.0)
explicitSet(Vector(1, 2, 3, 2, 3, 4)) is Set(1.0, 2.0, 3.0, 4.0)