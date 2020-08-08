// Solution-2.scala

// 2. In the previous exercise, an id of 1 isn’t really what we expected
// for February. We want that to be 2, since February is the second
// month. Try explicitly setting January to Value(1) and leaving the
// others alone. What does that tell you about what Value does?
// Satisfy the following tests:
// MonthName2.February is "February"
// MonthName2.February.id is 2
// MonthName2.December.id is 12
// MonthName2.July.id is 7

import com.atomicscala.AtomicTest._

object MonthName2 extends Enumeration {
    type MonthName2 = Value
    val January = Value(1)
    val February, March, April, May, June, July, August, 
        September, October, November, December = Value
}

MonthName2.February is "February"
MonthName2.February.id is 2
MonthName2.December.id is 12
MonthName2.July.id is 7

// Value continues numbering from 1 onwards