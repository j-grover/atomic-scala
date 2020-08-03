// Solution-2.scala

// 2. Create a tuple to hold the values 50 and 45. Unpack the values
// using numeric indices. Satisfy the following tests:
// val info = // fill this in
// info./* what goes here? */ is 50
// info./* what goes here? */ is 45

import com.atomicscala.AtomicTest._

val info = (50, 45)
info._1 is 50
info._2 is 45