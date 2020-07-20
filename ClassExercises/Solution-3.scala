// Solution-3.scala

// 3. Working from your solution to Exercise 2, modify the Info class to
// satisfy the following test:
// info.name = "This is the new name"
// info.name is "This is the new name"


import com.atomicscala.AtomicTest._

class Info(var name: String, var description: String)

val info = new Info("stuff", "Something")
info.name = "This is the new name"
info.name is "This is the new name"