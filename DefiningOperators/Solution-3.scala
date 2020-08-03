// Solution-3.scala

// 3. Adding to your solution for the previous exercise, replace power
// with ^. Satisfy the following tests:
// val a2 = new FancyNumber2(2)
// a2.^(3) is 8
// val b2 = new FancyNumber2(10)
// b2 ^ 2 is 100

import com.atomicscala.AtomicTest._

import scala.math.pow

class FancyNumber2(num: Int) {
    def ^(n: Int) = pow(num, n).toInt
}

val a2 = new FancyNumber2(2)
a2.^(3) is 8

val b2 = new FancyNumber2(10)
b2 ^ 2 is 100