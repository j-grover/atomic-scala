// Solution-5.scala

// 5. Modify your SimpleTime solution to use default arguments for
// minutes (see Named & Default Arguments). Satisfy the following
// tests:
// val anotherT1 =
//  new SimpleTimeDefault(10, 30)
// val anotherT2 = new SimpleTimeDefault(9)
// val anotherST =
//  anotherT1.subtract(anotherT2)
// anotherST.hours is 1
// anotherST.minutes is 30
// val anotherST2 = new SimpleTimeDefault(10).
//  subtract(new SimpleTimeDefault(9, 45))
// anotherST2.hours is 0
// anotherST2.minutes is 15  

import com.atomicscala.AtomicTest._

class SimpleTimeDefault(var hours: Int, var minutes: Int = 0) {
    def subtract(t2: SimpleTimeDefault): SimpleTimeDefault = {
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

val anotherT1 = new SimpleTimeDefault(10, 30)
val anotherT2 = new SimpleTimeDefault(9)

val anotherST = anotherT1.subtract(anotherT2)
anotherST.hours is 1
anotherST.minutes is 30

val anotherST2 = new SimpleTimeDefault(10).subtract(new SimpleTimeDefault(9, 45))
anotherST2.hours is 0
anotherST2.minutes is 15  