// Solution-6.scala

// 6. Create a class with two methods, f and g. In g, throw a new type of
// exception that you define. In f, call g, catch its exception and, in
// the catch clause, throw a different exception (of a second type that
// you define). Test your code. 

import com.atomicscala.AtomicTest._

class E1 extends Exception
class E2 extends Exception

class ExceptionClass {
    def f = try {
        g
    } catch {
        case e: E1 => throw new E2
    }
    def g = throw new E1
}

val result1 = try {
    (new ExceptionClass).f
} catch {
    case e: E2 => "Caught E2"
}

val result2 = try {
    (new ExceptionClass).g
} catch {
    case e: E1 => "Caught E1"
}

result1 is "Caught E2"
result2 is "Caught E1"