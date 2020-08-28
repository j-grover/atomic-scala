// Solution-3.scala

// 3. Add another Red to EnumColor. What happens? 

import com.atomicscala.AtomicTest._

object EnumColor extends Enumeration {
    type EnumColor = Value
    val Red, Green, Blue, Red = Value
}

EnumColor.Red is "Red"
EnumColor.Blue is "Blue"
EnumColor.Green is "Green"

/* Results in:
.\TaggingTraitsAndCaseObjects\Solution-3.scala:9: error: Red is already defined as value Red
    val Red, Green, Blue, Red = Value
*/