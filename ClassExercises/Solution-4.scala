// Solution-4.scala

// 4. Modify SimpleTime (from Named & Default Arguments) to add a
// method subtract that subtracts one SimpleTime object from 
// another. If the second time is greater than the first, just return
// zero. Satisfy the following tests:
// val t1 = new SimpleTime(10, 30)
// val t2 = new SimpleTime(9, 30)
// val st = t1.subtract(t2)
// st.hours is 1
// st.minutes is 0
// val st2 = new SimpleTime(10, 30).
//  subtract(new SimpleTime(9, 45))
// st2.hours is 0
// st2.minutes is 45
// val st3 = new SimpleTime(9, 30).
//  subtract(new SimpleTime(10, 0))
// st3.hours is 0
// st3.minutes is 0

import com.atomicscala.AtomicTest._

class SimpleTime(var hours: Int, var minutes: Int) {
    def subtract(t2: SimpleTime): SimpleTime = {
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

val t1 = new SimpleTime(10, 30)
val t2 = new SimpleTime(9, 30)

val st = t1.subtract(t2)
st.hours is 1
st.minutes is 0

val st2 = new SimpleTime(10, 30).subtract(new SimpleTime(9, 45))
st2.hours is 0
st2.minutes is 45

val st3 = new SimpleTime(9, 30).subtract(new SimpleTime(10, 0))
st3.hours is 0
st3.minutes is 0