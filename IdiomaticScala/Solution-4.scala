// Solution-4.scala

// 4. Refactor AddMultiply.scala from Methods. Remove the return type
// of the method. 

import com.atomicscala.AtomicTest._

// AddMultiply.scala

def addMultiply(
    x: Int,
    y: Double, s: String
) = { 
    println(s)
    (x + y) * 2.1
}

val r2 = addMultiply(7, 9, "Inside addMultiply")
println(r2)

def test(
    x: Int, 
    y: Double,
    s: String, 
    expected: Double
) = {
  val result = addMultiply(x, y, s)
  assert(result == expected, "Expected " + expected + " Got " + result)
  println("result: " + result)
}

test(7, 9, "Inside addMultiply", 33.6)