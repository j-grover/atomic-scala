// Solution-1.scala

// 1. Modify DisplayVectorWithAnonymous.scala to store results in a
// String, as in DisplayDuckTestable.scala. Satisfy the following test:
// str is "1234"
 
import com.atomicscala.AtomicTest._

val v = Vector(1, 2, 3, 4)
var str = ""
v.foreach(n => str += n)

str is "1234"