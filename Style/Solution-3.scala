// Solution-3.scala

// 3. Refactor your solution to Exercise 1, renaming the class Exclaim3.
// Remove the method that doesn’t match the conventional style for
// parentheses in Scala. 

import com.atomicscala.AtomicTest._

case class Exclaim3(var s: String) {
    def noParens = s + "!"
}

val e3 = new Exclaim3("yes")
e3.parens is "yes!"