// Solution-1.scala

// 1. Create three methods: the first checks only preconditions, the
// second checks only postconditions, and the third checks both.
// Each method has the same body: it takes a String argument which
// must be between 4-10 characters, and each of those characters
// must represent a digit. Each method converts each digit into an Int
// and then adds up all the digits to produce the result. The
// postcondition should verify the result is in the expected range of
// values. 
 
import com.atomicscala.AtomicTest._

def pre(arg: String) = {
    require(arg.length >= 4 && arg.length <= 10, "Not betweeen 4-10 chars")
    require(arg.forall(_.isDigit), "Not all digits")
    arg.map(_.asDigit).sum
}

def post(arg: String) = {
    val result = arg.map(_.asDigit).sum
    assume(result >= 4 && result <= 90, "Result not in range")
    result
}

def both(arg: String) = {
    require(arg.length >= 4 && arg.length <= 10, "Not betweeen 4-10 chars")
    require(arg.forall(_.isDigit), "Not all digits")
    val result = arg.map(_.asDigit).sum
    assume(result >= 4 && result <= 90, "Result not in range")
    result
}

def test(arg: String, func: String => Int, exp: Int) = {
    try {
        func(arg) is exp
    } catch {
        case e: Throwable => println(e.getMessage)
    }
}

test("000", pre, 0)
test("000000000000000", pre, 0)
test("1234", pre, 10)
println("---")

test("11", post, 4)
test("9999999999999999", post, 90)
test("12345", post, 15)
println("---")

test("000", both, 0)
test("000000000000000", both, 0)
test("1234", both, 10)

test("11", both, 4)
test("9999999999999999", both, 90)
test("12345", both, 15)