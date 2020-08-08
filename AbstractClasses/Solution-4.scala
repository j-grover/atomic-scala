// Solution-4.scala

// 4. Can case classes inherit from abstract classes? 

import com.atomicscala.AtomicTest._

abstract class Adder(x: Int) {
    def add(y: Int): Int
}

case class NumericAdder(x: Int)
extends Adder(x) {
    def add(y: Int): Int = y + x
}

val num = NumericAdder(5)
num.add(10) is 15

// Yes, case classes can inherit from abstract classes