// Solution-1.scala

// 1. Call println on an instance of a case class. Now combine the case
// class with Name and notice the difference. Remember to compile
// Name.scala and import it. 

import com.atomicscala.AtomicTest._
import com.atomicscala.Name

case class Temp(name: String)
val temp = Temp("name")

temp is "Temp(name)"

case class TempWithName(name: String) extends Name
val tempWithName = TempWithName("name")

tempWithName is "TempWithName"