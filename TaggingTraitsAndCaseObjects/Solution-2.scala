// Solution-2.scala

// 2. Implement Color as an Enumeration called EnumColor for
// comparison. Satisfy the following tests:
// EnumColor.Red is "Red"
// EnumColor.Blue is "Blue"
// EnumColor.Green is "Green"

import com.atomicscala.AtomicTest._

object EnumColor extends Enumeration {
    type EnumColor = Value
    val Red, Green, Blue = Value
}

EnumColor.Red is "Red"
EnumColor.Blue is "Blue"
EnumColor.Green is "Green"