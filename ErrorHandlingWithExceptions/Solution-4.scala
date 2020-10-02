// Solution-4.scala

// 4. Inherit your own subclass of Exception. Write a constructor for this
// class that takes a String argument and stores it inside the base-class 
// Exception object. Write a method that displays the stored String. Create a 
// try-catch clause to test your new exception class. 

import com.atomicscala.AtomicTest._

class MyException(str: String) extends Exception(str) {
    def msg = str 
}

val result = try {
    throw new MyException("my exception")
} catch {
    case e: MyException => e.msg
}

result is "my exception"