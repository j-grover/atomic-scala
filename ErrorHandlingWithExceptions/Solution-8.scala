// Solution-8.scala

// 8. Create a class called FailingConstructor with a constructor that can
// fail partway through the construction process and throw an
// exception. In another method, write code that properly guards
// against this failure.  

import com.atomicscala.AtomicTest._

class FailingConstructor(fail: Boolean) {
    var result = ""
    println("Starting construction")
    if (fail) throw new Exception else result = "Finished construction"
}

def testConstructor(fail: Boolean) = try {
    (new FailingConstructor(fail)).result
} catch {
    case e: Exception => "Failed construction"
}

testConstructor(false) is "Finished construction"
testConstructor(true) is "Failed construction"