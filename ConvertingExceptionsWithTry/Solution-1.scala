// Solution-1.scala

// 1. Modify TryTransform.scala to show that all the Try calls within the
// transform argument list can be replaced with Success. Satisfy the
// following tests:
// f(0) is "OK Bob"
// f(1) is "Reason"
// f(2) is "11"
// f(3) is "1.618"
 
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
).get 

f(0) is "OK Bob"
f(1) is "Reason"
f(2) is "11"
f(3) is "1.618"