// Solution-2.scala

// 2. Building on the previous exercise, change explicit to take a Vector.
// Create and return a List. Refer to the ScalaDoc for List, if necessary.
// Satisfy the following tests:
// explicitList(Vector(10.0, 20.0)) is
// List(10.0, 20.0)
// explicitList(Vector(1, 2, 3)) is
// List(1.0, 2.0, 3.0)

import com.atomicscala.AtomicTest._

def explicitList(v: Vector[Double]) = {
    v.toList
}

explicitList(Vector(10.0, 20.0)) is List(10.0, 20.0)
explicitList(Vector(1, 2, 3)) is List(1.0, 2.0, 3.0)