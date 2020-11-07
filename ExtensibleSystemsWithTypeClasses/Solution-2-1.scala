// Solution-2-1.scala

// 2. Add a new operation checkSum to Shape_Inheritance.scala that
// turns the area into a String, then sums each digit (and the decimal
// point) to produce an Int result. Verify that it works. Now do the
// same thing to Shape_TypeClass.scala and note the differences.

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

val shapes = Vector(Circle(2.2), EQLTriangle(3.9), Circle(4.5))

def a(s: Shape) = f"$s area: ${s.area}%.2f"

def checkSum(s: Shape) = s.area.toString.foldLeft(0)(_ + _)

val areas = for(s <- shapes) yield a(s)

areas is "Vector(Circle(2.2) area: " +
		 "13.82, EQLTriangle(3.9) area: 6.59, " +
		 "Circle(4.5) area: 28.27)"

val checkSums = for(s <- shapes) yield checkSum(s)

checkSums is "Vector(935, 891, 935)"