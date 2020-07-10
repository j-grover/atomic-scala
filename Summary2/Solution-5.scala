// Solution-5.scala

// 5. Create a package containing the classes in ClassBodies.scala.
// Compile this package, then import it into a script. Modify the
// classes by adding methods that produce results that can be tested
// with AtomicTest. 

import com.atomicscala.AtomicTest._
import com.atomicscala.ClassBodies._

val noBody = new NoBody
noBody.name is "No one"

val someBody = new SomeBody
someBody.name is "Janet Doe"

val everyBody = new EveryBody
val v1 = everyBody.all
v1(0).name is "Janet Doe"
v1(1).name is "Janet Doe"
v1(2).name is "Janet Doe"