// Solution-5.scala

// 5. We don’t declare method arguments as var or val. Discover
// whether Scala uses var or val method arguments by creating a
// simple class, then a method that takes an argument of that class.
// Inside the method, attempt to rebind the argument to a new object
// and observe the error message.
  
import com.atomicscala.AtomicTest._

class A

def test(a: A) = a = new A

/* Results in: 
.\ReferencesAndMutability\Solution-5.scala:13: error: reassignment to val
def test(a: A) = a = new A
*/