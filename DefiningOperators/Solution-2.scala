// Solution-2.scala

// 2. Create a class FancyNumber1 that takes an Int as a class
// parameter and has one method, power(n: Int) that raises that 
// number to the nth power. Hint: you may choose to use
// scala.math.pow, and if you do, investigate toInt and toDouble.
// Satisfy the following tests:
// val a1 = new FancyNumber1(2)
// a1.power(3) is 8
// val b1 = new FancyNumber1(10)
// b1.power(2) is 100

import com.atomicscala.AtomicTest._

import scala.math.pow

class FancyNumber1(num: Int) {
    def power(n: Int) = pow(num, n).toInt
}

val a1 = new FancyNumber1(2)
a1.power(3) is 8

val b1 = new FancyNumber1(10)
b1.power(2) is 100