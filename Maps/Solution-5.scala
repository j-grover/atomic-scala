// Solution-5.scala

// 5. Adding to your solution for the previous exercise, try to add a
// language that already exists to the Map (for example, French).
// Write tests to show what happens.
  
import com.atomicscala.AtomicTest._

val m = Map("English" -> "",
            "French" -> "",
            "Spanish" -> "",
            "German" -> "",
            "Chinese" -> "")

val m2 = m + ("French" -> "")
m2.keys is Set("English", "French", "Spanish", "German", "Chinese")