// Solution-2.scala

// 2. Remove the .get acting on the result of the transform. What must
// you do to make the tests pass?   

import com.atomicscala.AtomicTest._
import util.{Try, Success, Failure}
import errors._

def f(n: Int) = Try(toss(n)).transform(
    i => Success(s"$i Bob"), // Success
    e => e match { // Failure
        case Except1(why) => Success(why)
        case Except2(n) => Success(n)
        case Except3(msg, d) => Success(d)
    }
)

f(0) is Success("OK Bob")
f(1) is Success("Reason")
f(2) is Success(11)
f(3) is Success(1.618)

// Wrap results in Success for tests to pass and use Numeric values instead
// of strings for last 2 tests