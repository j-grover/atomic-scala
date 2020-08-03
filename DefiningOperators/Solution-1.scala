// Solution-1.scala

// 1. In Exercise 4 of Class Exercises, you created a class SimpleTime
// with a subtract method. Change the name of that method to use
// the minus sign (-). Satisfy the following tests:
// val someT1 = new SimpleTime2(10, 30)
// val someT2 = new SimpleTime2(9, 30)
// val someST = someT1 - someT2
// someST.hours is 1
// someST.minutes is 0
// val someST2 = new SimpleTime2(10, 30) -
//  new SimpleTime2(9, 45)
// someST2.hours is 0
// someST2.minutes is 45

import com.atomicscala.AtomicTest._

class SimpleTime2(var hours: Int, var minutes: Int) {
    def -(t2: SimpleTime2): SimpleTime2 = {
        if (t2.hours > hours) {
            hours = 0
            minutes = 0
        } else {
            if (t2.minutes > minutes) {
                minutes = 60 - t2.minutes + minutes
                if (hours - t2.hours == 1) {
                    hours = 0
                } else {
                    hours -= t2.hours + 1
                }
            } else {
                minutes -= t2.minutes
                hours -= t2.hours
            }
        }
        this
    }
}

val someT1 = new SimpleTime2(10, 30)
val someT2 = new SimpleTime2(9, 30)
val someST = someT1 - someT2
someST.hours is 1
someST.minutes is 0

val someST2 = new SimpleTime2(10, 30) - new SimpleTime2(9, 45)
someST2.hours is 0
someST2.minutes is 45
