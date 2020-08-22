// Solution-4.scala

// 4. In TraitBodies.scala in the Traits atom, we assert that the code on
// lines 70-71 creates a class without a type name. Determine if this
// is an exact statement. 

import com.atomicscala.AtomicTest._
import com.atomicscala.NameNoModifications

trait AllAbstract {
    def f(n: Int): Int
    val d: Double
}

trait PartialAbstract {
    def f(n: Int): Int
    val d: Double
    def g(s: String) = s"($s)"
    val j = 42
}

trait Concrete {
    def f(n: Int) = n * 11
    val d = 1.61803
}

// Create unnamed class on-the-fly:
val x = new AllAbstract 
    with PartialAbstract with Concrete with NameNoModifications

x is "$anon"