// Solution-3.scala

// 3. Inherit from the Adder class to make it operational. Satisfy the
// following tests:
// class NumericAdder(val x:Int)
// extends Adder(x) {
//  def add(y:Int):Int = // Complete this
// }
// val num = new NumericAdder(5)
// num.add(10) is 15

import com.atomicscala.AtomicTest._

abstract class Adder(x: Int) {
    def add(y: Int): Int
}

class NumericAdder(val x: Int)
extends Adder(x) {
    def add(y: Int): Int = y + x
}

val num = new NumericAdder(5)
num.add(10) is 15