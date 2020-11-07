// Solution-1-1.scala

// 1. Add class Rectangle to Shape_Inheritance.scala and verify that it
// works. Now add class Rectangle and its associated RectangleCalc
// to Shape_TypeClass.scala and verify that it works. Note the
// differences. 
 
import com.atomicscala.AtomicTest._
import scala.math.{Pi, sqrt}

trait Shape {
	def area: Double
}

case class Circle(radius: Double)
extends Shape {
	def area = 2 * Pi * radius
}

case class EQLTriangle(side: Double)
extends Shape {
	def area = (sqrt(3) / 4) * side * side
}

case class Rectangle(width: Double, length: Double)
extends Shape {
	def area = length * width
}

val shapes = Vector(Circle(2.2), EQLTriangle(3.9), Circle(4.5), 
					Rectangle(2.5, 2.0))

def a(s: Shape) = f"$s area: ${s.area}%.2f"

val result = for(s <- shapes) yield a(s)

result is "Vector(Circle(2.2) area: " +
		  "13.82, EQLTriangle(3.9) area: 6.59, " +
		  "Circle(4.5) area: 28.27, " +
		  "Rectangle(2.5,2.0) area: 5.00)" 
