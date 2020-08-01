// Solution-4.scala

// 4. Add the variable count to the class in the previous exercise.
// Increment count when someone calls the method that adds an
// exclamation point. Call that method twice and satisfy the
// following test:
// val e4 = new Exclaim4("counting")
// // Call exclamation method
// // Call exclamation method again
// e4.count is 2

import com.atomicscala.AtomicTest._

case class Exclaim4(var s: String) {
    var count = 0
    def parens() = {
        s + "!"
        count += 1
    }
}

val e4 = new Exclaim4("counting")
e4.parens()
e4.parens()
e4.count is 2