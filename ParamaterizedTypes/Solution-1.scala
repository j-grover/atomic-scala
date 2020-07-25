// Solution-1.scala

// 1. Modify explicit in ParameterizedReturnTypes.scala so it creates
// and returns a Vector of Double. Satisfy the following test:
// explicitDouble(1.0, 2.0, 3.0) is
// Vector(1.0, 2.0, 3.0)

import com.atomicscala.AtomicTest._

def explicitDouble(c1: Double, c2: Double, c3: Double): Vector[Double] = {
    Vector(c1, c2, c3)
}

explicitDouble(1.0, 2.0, 3.0) is Vector(1.0, 2.0, 3.0)