// Solution-7.scala

// 7. Create a class that has both mutable and immutable fields. Is the
// resulting class mutable or immutable? 

import com.atomicscala.AtomicTest._

class Person(val name: String, var age: Int)

val p = new Person("Sam", 5)
p.age = 10
p.age is 10

// Result class is mutable as age can be modified even though name cannot be