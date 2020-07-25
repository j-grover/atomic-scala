// Solution-1.scala

// 1. Modify SimpleMap.scala so the anonymous function multiplies
// each value by 11 and adds 10. Satisfy the following tests:
// val v = Vector(1, 2, 3, 4)
// v.map(/* Fill this in */) is
//  Vector(21, 32, 43, 54)
 
import com.atomicscala.AtomicTest._

val v = Vector(1, 2, 3, 4)
v.map(x => x * 11 + 10) is Vector(21, 32, 43, 54)
