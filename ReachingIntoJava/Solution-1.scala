// Solution-1.scala

// 1. Import the class SimpleDateFormat, used for specifying what the
// input date string looks like, from java.text.SimpleDateFormat. Use
// Java’s SimpleDateFormat to create a pattern, named datePattern,
// that you parse as 2-digit Month/2-digit Day/2-digit Year (Hint:
// MM/dd/yy). Satisfy the following test:
// val mayDay = datePattern.parse("05/01/12")
// mayDay.getDate is 1
// mayDay.getMonth is 4

import com.atomicscala.AtomicTest._
import java.text.SimpleDateFormat

val datePattern = new SimpleDateFormat("MM/dd/yy")

val mayDay = datePattern.parse("05/01/12")
mayDay.getDate is 1
mayDay.getMonth is 4