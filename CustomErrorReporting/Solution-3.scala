// Solution-3.scala

// 3. Write a method testArgs that takes a variable argument list of
// tuples, where each tuple contains a Boolean expression and a
// String message for when the Boolean fails. For each tuple, produce
// a Success or Failure. Now create a method:
// f(s:String, i:Int, d:Double)
// Within the method, call testArgs passing it the following tuples:
// (s.length > 0, "s must be non-zero length"),
// (s.length <= 10, "length of s must be <= 10"),
// (i >= 0, "i must be positive"),
// (d > 0.1, "d must be > 0.1"),
// (d < 0.9, "d must be < 0.9")
// Take the output and filter it so only Failure objects remain. Satisfy
// the following tests:
// f("foo", 11, 0.5) is ""
// f("foobarbazbingo", 11, 0.5) is
// "Failure(length of s must be <= 10)"
// f("", 11, 0.5) is
// "Failure(s must be non-zero length)"
// f("foo", -11, 0.5) is
// "Failure(i must be positive)"
// f("foo", 11, 0.1) is
// "Failure(d must be > 0.1)"
// f("foo", 11, 0.9) is
// "Failure(d must be < 0.9)" 

import com.atomicscala.AtomicTest._
import com.atomicscala.reporterr.Fail
import util.{Success, Failure}

def testArgs(args: (Boolean, String)*) = {
    args.map(arg => if (arg._1) Success else Fail(arg._2))
}

def f(s: String, i: Int, d: Double) = {
    testArgs(
        (s.length > 0, "s must be non-zero length"),
        (s.length <= 10, "length of s must be <= 10"),
        (i >= 0, "i must be positive"),
        (d > 0.1, "d must be > 0.1"),
        (d < 0.9, "d must be < 0.9") 
    ).filter(_.isInstanceOf[Failure[_]]).mkString(", ")
}

f("foo", 11, 0.5) is ""
f("foobarbazbingo", 11, 0.5) is "Failure(length of s must be <= 10)"
f("", 11, 0.5) is "Failure(s must be non-zero length)"
f("foo", -11, 0.5) is "Failure(i must be positive)"
f("foo", 11, 0.1) is "Failure(d must be > 0.1)"
f("foo", 11, 0.9) is "Failure(d must be < 0.9)"