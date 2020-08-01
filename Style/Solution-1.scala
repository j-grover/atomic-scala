// Solution-1.scala

// 1. Create a class Exclaim with a class argument var s:String. Create
// methods parens and noParens that append an exclamation point
// to s and return it. Satisfy the following tests:
// val e = new Exclaim("yes")
// e.noParens is "yes!"
// e.parens() is "yes!"

import com.atomicscala.AtomicTest._

case class Exclaim(var s: String) {
    def parens() = s + "!"
    def noParens = s + "!"
}

val e = new Exclaim("yes")
e.noParens is "yes!"
e.parens() is "yes!"