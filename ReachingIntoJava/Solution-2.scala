// Solution-2.scala

// 2. In your solution for Exercise 1, why do you specify “MM” in the
// SimpleDateFormat pattern instead of “mm?” What does the parser
// expect if you specify “mm?” Try it. 

import com.atomicscala.AtomicTest._
import java.text.SimpleDateFormat

val datePattern = new SimpleDateFormat("mm/dd/yy")

val mayDay = datePattern.parse("05/01/12")
mayDay.getDate is 1
mayDay.getMonth is 4

// Parser expects minutes for mm (so getMonth returns 0 instead of 4)