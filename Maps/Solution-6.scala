// Solution-6.scala

// 6. Remove “Spanish” from your Map in Exercise 4. Remove
// “jiminy@cricket.com” from the Map in Exercise 3. Write tests to
// show the removals. 

import com.atomicscala.AtomicTest._

val m = Map("English" -> "",
            "French" -> "",
            "Spanish" -> "",
            "German" -> "",
            "Chinese" -> "")

val m2 = m - "Spanish"
m2.keys is Set("English", "French", "German", "Chinese")

case class Name(firstName: String, lastName: String)

val m3 = Map("sally@taylor.com" -> Name("Sally", "Taylor"),
             "jiminy@cricket.com" -> Name("Jiminy", "Cricket"))

val m4 = m3 - "jiminy@cricket.com"
m4.keys is Set("sally@taylor.com")