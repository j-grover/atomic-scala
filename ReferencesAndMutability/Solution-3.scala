// Solution-3.scala

// 3. Show the difference between a mutable and immutable List. 

import com.atomicscala.AtomicTest._
// import collection.mutable.MutableList

val l = List(1, 2)

var l2 = l
l2 :+= 9
l2 is List(1, 2, 9)
l is List(1, 2)

var ml = MutableList(1, 2)

var l3 = ml
l3 +:= 9
l3 is MutableList(1, 2, 9)
ml is MutableList(1, 2, 9) 