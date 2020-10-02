// Solution-7.scala

// 7. Demonstrate that a derived-class constructor cannot catch
// exceptions thrown by its base-class constructor. 

import com.atomicscala.AtomicTest._

class BaseException extends Exception

class Base {
    throw new BaseException
}

class Derived extends Base {
    // Base class constructor called first, so exception is already
    // thrown by the time we get here
}

val result = try {
    new Derived
} catch {
    case e: BaseException => "Base Exception"
}

result is "Base Exception"