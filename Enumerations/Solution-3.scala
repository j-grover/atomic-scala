// Solution-3.scala

// 3. Building from the previous exercise, demonstrate how to use
// import so you don’t have to qualify the name space. Create a
// method monthNumber that returns the appropriate value. Satisfy
// the following tests:
// July is "July"
// monthNumber(July) is 7

import com.atomicscala.AtomicTest._

object MonthName2 extends Enumeration {
    type MonthName2 = Value
    val January = Value(1)
    val February, March, April, May, June, July, August, 
        September, October, November, December = Value
}

import MonthName2._

def monthNumber(monthName: MonthName2) = monthName.id

July is "July"
monthNumber(July) is 7