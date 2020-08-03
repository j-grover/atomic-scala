// Solution-4.scala

// 4. Building on the previous exercise, add another method ** which
// does the same thing as ^. Do you see a benefit to leaving in the
// method power and calling that from both methods? Satisfy the
// following tests:
// val a3 = new FancyNumber3(2.0)
// a3.**(3) is 8
// val b3 = new FancyNumber3(10.0)
// b3 ** 2 is 100

import com.atomicscala.AtomicTest._

import scala.math.pow

class FancyNumber3(num: Double) {
    def power(n: Double) = pow(num, n).toInt
    def ^(n: Double) = power(n)
    def **(n: Double) = power(n)
}

val a3 = new FancyNumber3(2)
a3.**(3) is 8

val b3 = new FancyNumber3(10.0)
b3 ** 2 is 100

// Power method can be reused in both methods