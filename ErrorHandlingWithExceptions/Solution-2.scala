// Solution-2.scala

// 2. Create a class with a simple method f. Create a var of that class
// and initialize it to the special pre-defined value null, which means
// “nothing.” Try to call f using this var. Now wrap the call in a try-catch 
// clause to catch the exception.  

import com.atomicscala.AtomicTest._

class Test {
    def f = "Exception"
}

var t: Test = null

val result = try {
    t.f
} catch {
    case e: NullPointerException => "Caught exception"
}

result is "Caught exception"