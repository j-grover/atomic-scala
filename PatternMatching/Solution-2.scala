// Solution-2.scala

// 2. Rewrite oneOrTheOther from More Conditionals using pattern
// matching. Satisfy the following tests:
// val v = Vector(1)
// val v2 = Vector(3, 4) 
// oneOrTheOther(v == v.reverse) is "True!"
// oneOrTheOther(v2 == v2.reverse) is
// "It's false"

import com.atomicscala.AtomicTest._

def oneOrTheOther(exp: Boolean): String = {
    exp match {
        case true => "True!"
        case _ => "It's false"
    }
} 

val v = Vector(1)
val v2 = Vector(3, 4) 
oneOrTheOther(v == v.reverse) is "True!"
oneOrTheOther(v2 == v2.reverse) is "It's false"