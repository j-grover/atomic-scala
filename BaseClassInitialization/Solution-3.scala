// Solution-3.scala

// 3. Define a class Home derived from House with an additional
// Boolean field heart. Satisfy the following tests:
// val h = new Home
// h.toString is "Where the heart is"
// h.heart is true

import com.atomicscala.AtomicTest._

class House {
    override def toString = "Where the heart is"
}

class Home extends House {
    val heart = true
}

val h = new Home
h.toString is "Where the heart is"
h.heart is true