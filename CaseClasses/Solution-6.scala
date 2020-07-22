// Solution-6.scala

// 6. Can you use default arguments with case classes? Repeat Exercise
// 5 from Class Exercises to find out. How does your solution differ, if
// at all? Satisfy the following tests:
// val anotherT1 =
//  new SimpleTimeDefault(10, 30)
// val anotherT2 = new SimpleTimeDefault(9)
// val anotherST =
//  anotherT1.subtract(anotherT2)
// anotherST.hours is 1
// anotherST.minutes is 30
// val anotherST2 =
//  new SimpleTimeDefault(10).subtract(
//  new SimpleTimeDefault(9, 45))
// anotherST2.hours is 0
// anotherST2.minutes is 15

import com.atomicscala.AtomicTest._

case class SimpleTimeDefault(hours: Int, minutes: Int = 0) {
  def subtract(t2: SimpleTimeDefault): SimpleTimeDefault = {
    val h = hours - t2.hours
    val m = minutes - t2.minutes

    if (h < 0)
       return SimpleTimeDefault(0)
    if (m >= 0)
      SimpleTimeDefault(h, m)
    else
      SimpleTimeDefault(h - 1, m + 60)
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