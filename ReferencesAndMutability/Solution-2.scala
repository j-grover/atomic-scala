// Solution-2.scala

// 2. Show the difference between a mutable and immutable Set. 

import com.atomicscala.AtomicTest._
import collection.mutable.{Set => MutSet}

val s = Set("a", "b")

var s2 = s
s2 += ("c")
s2 is Set("a", "b", "c")
s is Set("a", "b")

val ms = MutSet("a", "b")

var s3 = ms
s3 += ("c")
s3 is Set("a", "b", "c")
ms is Set("a", "b", "c")