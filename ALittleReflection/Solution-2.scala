// Solution-2.scala

// 2. Can you use reflection on a class that isn’t a case class? Repeat
// Exercise 1 using a non-case class.  

import com.atomicscala.AtomicTest._
import com.atomicscala.Name

class TempWithName(name: String) extends Name
val tempWithName = new TempWithName("name")

tempWithName is "TempWithName"

// Yes, reflection can beused on just a class as well