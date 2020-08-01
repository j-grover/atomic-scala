// Solution-2.scala

// 2. Building on Exercise 1, change noParens to be a field (val) instead
// of a method. Satisfy the following tests:
// val e2 = new Exclaim2("yes")
// e2.noParens is "yes!"
// e2.parens() is "yes!"

import com.atomicscala.AtomicTest._

case class Exclaim2(var s: String) {
    def parens() = s + "!"
    val noParens = s + "!"
}

val e2 = new Exclaim2("yes")
e2.noParens is "yes!"
e2.parens() is "yes!"