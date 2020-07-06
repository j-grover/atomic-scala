// Solution-5.scala

// 5. Use Test Driven Development (write a failing test, and then write
// the code to fix it) to calculate the area of a quadrangle. Start with
// the following sample code and fix the intentional bugs:
// def squareArea(x: Int):Int = { x * x }
// def rectangleArea(x:Int, y:Int):Int = { x * x }
// def trapezoidArea(x:Int, y:Int,
//  h:Int):Double = { h/2 * (x + y) } 
// squareArea(1) is 1
// squareArea(2) is 4
// squareArea(5) is 25
// rectangleArea(2, 2) is 4
// rectangleArea(5, 4) is 20
// trapezoidArea(2, 2, 4) is 8
// trapezoidArea(3, 4, 1) is 3.5

import com.atomicscala.AtomicTest._

def squareArea(x: Int): Int = { x * x }
def rectangleArea(x: Int, y: Int): Int = { x * y }
def trapezoidArea(x: Int, y: Int, h: Int): Double = { h / 2.0 * (x + y) } 

squareArea(1) is 1
squareArea(2) is 4
squareArea(5) is 25
rectangleArea(2, 2) is 4
rectangleArea(5, 4) is 20
trapezoidArea(2, 2, 4) is 8
trapezoidArea(3, 4, 1) is 3.5