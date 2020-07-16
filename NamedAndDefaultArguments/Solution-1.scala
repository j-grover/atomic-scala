// Solution-1.scala

// 1. Define a class SimpleTime that takes two arguments: an Int that
// represents hours, and an Int that represents minutes. Use named
// arguments to create a SimpleTime object. Satisfy the following
// tests:
// val t = new SimpleTime(hours=5, minutes=30)
// t.hours is 5
// t.minutes is 30
 
import com.atomicscala.AtomicTest._

class SimpleTime(val hours: Int, val minutes: Int)

val t = new SimpleTime(hours=5, minutes=30)
t.hours is 5
t.minutes is 30