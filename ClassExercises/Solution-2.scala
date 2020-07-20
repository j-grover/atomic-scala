// Solution-2.scala

// 2. Make a class Info that has a String field name that can be retrieved
// from outside the class (but not modified) and a String field
// description that can be both modified and retrieved from outside
// the class. Satisfy the following tests:
// val info = new Info("stuff", "Something")
// info.name is "stuff"
// info.description is "Something"
// info.description = "Something else"
// info.description is "Something else"

import com.atomicscala.AtomicTest._

class Info(val name: String, var description: String)

val info = new Info("stuff", "Something")
info.name is "stuff"
info.description is "Something"
info.description = "Something else"
info.description is "Something else"