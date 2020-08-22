// Solution-3.scala

// 3. Comment out the code in Name.scala that replaces the $ with
// spaces and splits the String, so you see what Scala’s reflection
// returns before our modifications. Repeat Exercise 2 using this new
// class.

import com.atomicscala.AtomicTest._
import com.atomicscala.NameNoModifications

class TempWithName(name: String) extends NameNoModifications
val tempWithName = new TempWithName("name")

tempWithName is "class $TempWithName"
