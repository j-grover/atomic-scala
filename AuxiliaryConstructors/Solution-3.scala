// Solution-3.scala

// 3. Show that the first line of an auxiliary constructor must be a call to
// the primary constructor. 

import com.atomicscala.AtomicTest._

class Primary {
    def this() = {
        println("Fail")
    }
}

/* Results in:
.\AuxiliaryConstructors\Solution-3.scala:10: error: 'this' 
expected but identifier found.
        println("Fail")
*/