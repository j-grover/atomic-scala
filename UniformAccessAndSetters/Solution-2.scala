// Solution-2.scala

// 2. Does the uniform access principle demonstrated in
// UniformAccess.scala work when Base is a concrete class? Can you
// think of a different way to use a setter here? Hint: Look at Base
// Class Initialization. 

import com.atomicscala.AtomicTest._

class Base (var d3: Int) {
    def f1: Int = 0
    def f2: Int = 0
    val d1: Int = 0
    val d2: Int = 0
    var n = 1
}

class Derived(d3: Int) extends Base(d3) {
    override def f1 = 1
    override val f2 = 1
    override val d1 = 1
    override val d2 = 1
}

val d = new Derived(1)
d.d3 is 1 
d.d3 = 42 
d.d3 is 42