// Solution-5.scala

// 5. Using the Apache Commons Math library that you imported above,
// calculate the mean and standard deviation and percentile of the
// following data set: 10, 20, 30, 80, 90, and 100. Satisfy the following
// tests:
// val s = new SummaryStatistics
// // add values here
// s.getMean is 55
// s.getStandardDeviation is
// 39.370039370059054

import com.atomicscala.AtomicTest._
import org.apache.commons.math3.stat._

val s = new SummaryStatistics
s.addValue(10)
s.addValue(20)
s.addValue(30)
s.addValue(80)
s.addValue(90)
s.addValue(100)

s.getMean is 55
s.getStandardDeviation is 39.370039370059054