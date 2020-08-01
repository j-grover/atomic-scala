// Solution-7.scala

// 7. Refactor ClassArg.scala and VariableClassArgs.scala from Class
// Arguments. 

import com.atomicscala.AtomicTest._

// ClassArg.scala

class ClassArg(a: Int) {
    println(f)
    def f = a * 10
}

val ca = new ClassArg(19)
ca.f is 190