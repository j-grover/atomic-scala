// Solution-4.scala

// 4. The Apache Commons Math library (imported in this atom),
// contains a class called Frequency in
// org.apache.commons.math.stat.Frequency. Use its addValue
// method to add some strings to Frequency. Satisfy the following
// test: 
// val f = new Frequency
// // add values for cat, dog, cat, bird,
// // cat, cat, kitten, mouse here
// f.getCount("cat") is 4

import com.atomicscala.AtomicTest._
import org.apache.commons.math3.stat.Frequency

val f = new Frequency
f.addValue("cat")
f.addValue("dog")
f.addValue("cat")
f.addValue("bird")
f.addValue("cat")
f.addValue("cat")
f.addValue("kitten")
f.addValue("mouse")
f.getCount("cat") is 4