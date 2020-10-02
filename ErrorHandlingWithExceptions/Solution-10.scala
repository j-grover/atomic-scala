// Solution-10.scala

// 10. The exception-handling mechanism includes another keyword,
// finally. A finally clause is executed regardless of what happens in
// the try or catch clauses. A finally clause can directly follow a try
// clause (with no catch) or it can be placed after a catch clause.
// Demonstrate that the finally clause always executes. 

import com.atomicscala.AtomicTest._

def catchAndThrow =
    try {
        throw new Exception("Throw Exception")
    } catch {
        case e: Exception => println(e.getMessage)
    } finally {
        println("Finally executed")
    }

println("---- catchAndThrow ----")
catchAndThrow

def catchAndNoThrow =
    try {
    } catch {
        case e: Exception => println(e.getMessage)
    } finally {
        println("Finally executed")
    }

println("\n---- catchAndNoThrow ----")
catchAndNoThrow

def noCatchAndThrow =
    try {
        throw new Exception("Throw Exception")
    } finally {
        println("Finally executed")
    }

println("\n---- noCatchAndThrow ----")
try {
    noCatchAndThrow
} catch {
    case e: Exception => println("Outside Throw Exception")
}

def noCatchAndNoThrow =
    try {
    } finally {
        println("Finally executed")
    }

println("\n---- noCatchAndNoThrow ----")
noCatchAndNoThrow

/* Results in:
---- catchAndThrow ----
Throw Exception
Finally executed

---- catchAndNoThrow ----
Finally executed

---- noCatchAndThrow ----
Finally executed
Outside Throw Exception

---- noCatchAndNoThrow ----
Finally executed
*/