// Solution-1.scala

// 1. Create a method that throws an object of class Exception inside a
// try block. Pass a String argument to the constructor. Catch the
// exception inside a catch clause and test the String argument. 
 
import com.atomicscala.AtomicTest._

def test =
    try {
        throw new Exception("arg")
    } catch {
        case e: Exception => e.getMessage
    }

test is "arg"