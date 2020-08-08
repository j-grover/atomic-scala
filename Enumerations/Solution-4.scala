// Solution-4.scala

// 4. Create a method season that takes a MonthName type (from
// Exercise 1) and returns “Winter” if the month is December,
// January, or February, “Spring” if March, April, or May, “Summer” if
// June, July, or August, and “Autumn” if September, October, or
// November. Satisfy the following tests:
// season(January) is "Winter"
// season(April) is "Spring"
// season(August) is "Summer"
// season(November) is "Autumn"

import com.atomicscala.AtomicTest._

object MonthName extends Enumeration {
    type MonthName = Value
    val January, February, March, April, May, June, July, August, 
        September, October, November, December = Value
}

import MonthName._

def season(monthName: MonthName) =
    monthName match {
        case December | January | February  => "Winter"
        case March | April | May            => "Spring"
        case June | July | August           => "Summer"
        case _                              => "Autumn"
    }

season(January) is "Winter"
season(April) is "Spring"
season(August) is "Summer"
season(November) is "Autumn"