// Solution-7.scala

// 7. Defaulting both hours and minutes in the previous exercise is
// problematic. Can you see why? Can you figure out how to use
// named arguments to solve this problem? Did you have to change
// any code?   

import com.atomicscala.AtomicTest._


class SimpleTimeAux(var hours: Int = 0, var minutes: Int = 0) {
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
}

val auxT1 = new SimpleTimeAux(10, 5)
val auxT2 = new SimpleTimeAux(hours=6)

val auxST = auxT1.subtract(auxT2)
auxST.hours is 4
auxST.minutes is 5

val auxST2= new SimpleTimeAux(12).subtract(new SimpleTimeAux(9, 45))
auxST2.hours is 2
auxST2.minutes is 15