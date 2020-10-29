// Solution-3.scala

// 3. Write a method that takes an Int argument, multiplies it by 3, and
// has a postcondition that fails if the result is odd. Elide the
// postcondition and show the failure slipping through. Add a
// precondition to prevent the failure. 

import com.atomicscala.AtomicTest._

def multiply(input: Int) = {
    require(input % 2 == 0, "Input should be even")
    var result = input * 3
    assume(result % 2 == 0, "Result should be even")
    result
}

def test(arg: Int, exp: Int) = {
    try {
        multiply(arg) is exp
    } catch {
        case e: Throwable => println(e.getMessage)
    }
}

test(1, 3)
test(2, 6)