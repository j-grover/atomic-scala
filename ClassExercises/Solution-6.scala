// Solution-6.scala

// 6. Modify your solution for Exercise 5 to use an auxiliary constructor.
// Again, satisfy the following tests:
// val auxT1 = new SimpleTimeAux(10, 5)
// val auxT2 = new SimpleTimeAux(6)
// val auxST = auxT1.subtract(auxT2)
// auxST.hours is 4
// auxST.minutes is 5
// val auxST2= new SimpleTimeAux(12).subtract(
//  new SimpleTimeAux(9, 45))
// auxST2.hours is 2
// auxST2.minutes is 15 

import com.atomicscala.AtomicTest._

class SimpleTimeAux(var hours: Int, var minutes: Int) {
    def subtract(t2: SimpleTimeAux): SimpleTimeAux = {
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

    def this(hours: Int) {
        this(hours, 0)
    }
}

val auxT1 = new SimpleTimeAux(10, 5)
val auxT2 = new SimpleTimeAux(6)

val auxST = auxT1.subtract(auxT2)
auxST.hours is 4
auxST.minutes is 5

val auxST2= new SimpleTimeAux(12).subtract(new SimpleTimeAux(9, 45))
auxST2.hours is 2
auxST2.minutes is 15