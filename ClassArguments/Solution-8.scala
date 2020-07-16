// Solution-8.scala

// 8. Continue working with the Cup2 class. Modify the add method to
// take a variable argument list. Specify any number of pours
// (increase) and spills (decrease = increase with a negative value)
// and return the resulting value. Satisfy the following tests:
// val cup5 = new Cup5(0)
// cup5.increase(20, 30, 50,
//  20, 10, -10, -40, 10, 50) is 100
// cup5.increase(10, 10, -10, 10,
// 90, 70, -70) is 30

import com.atomicscala.AtomicTest._

class Cup5(var percentFull: Int) {
  val max = 100
  def increase(pour: Int*): Int = {
    for (p <- pour) {
      percentFull += p
      if (percentFull > max) {
        percentFull = max
      }
    }
    percentFull     
  }
}

val cup5 = new Cup5(0)
cup5.increase(20, 30, 50, 20, 10, -10, -40, 10, 50) is 100
cup5.increase(10, 10, -10, 10, 90, 70, -70) is 30