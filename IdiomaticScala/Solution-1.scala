// Solution-1.scala

// 1. Refactor If4.scala and If5.scala from Conditional Expressions. 
 
import com.atomicscala.AtomicTest._

// If4.scala

val z = false
if (z)
    println("It's true!")
else
    println("It's false")

// If5.scala

val result =
    if (99 > 100) 4
    else 42
println(result)