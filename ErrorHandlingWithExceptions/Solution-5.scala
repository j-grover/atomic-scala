// Solution-5.scala

// 5. Create three new subtypes of Exception. Write a method that
// throws all three. In another method, call the first method but only
// use a single catch clause to catch all three types of exception.

import com.atomicscala.AtomicTest._

class E1 extends Exception
class E2 extends Exception
class E3 extends Exception

def throwExceptions(num: Int) = num match {
    case 1 => throw new E1
    case 2 => throw new E2
    case 3 => throw new E3
}

def catchExceptions(num: Int) = try {
    throwExceptions(num)
} catch {
    case e: E1 => "E1"
    case e: E2 => "E2"
    case e: E3 => "E3"
}

catchExceptions(1) is "E1"
catchExceptions(2) is "E2"
catchExceptions(3) is "E3"