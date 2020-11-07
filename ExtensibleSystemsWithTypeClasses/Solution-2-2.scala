// Solution-2-2.scala

// 2. Add a new operation checkSum to Shape_Inheritance.scala that
// turns the area into a String, then sums each digit (and the decimal
// point) to produce an Int result. Verify that it works. Now do the
// same thing to Shape_TypeClass.scala and note the differences.

import com.atomicscala.AtomicTest._
import scala.math.{Pi, sqrt}

trait Calc[S] {
	def area(shape: S): Double
}

def a[S](shape: S)(implicit calc: Calc[S]) =
	f"$shape area: ${calc.area(shape)}%2.2f"

def checkSum[S](shape: S)(implicit calc: Calc[S]) =
	calc.area(shape).toString.foldLeft(0)(_ + _)

case class Circle(radius:Double)

implicit object CircleCalc
extends Calc[Circle] {
	def area(shape: Circle) =
		2 * shape.radius * Pi
}

case class EQLTriangle(side: Double)

implicit object EQLTriangleCalc
extends Calc[EQLTriangle] {
	def area(shape: EQLTriangle) =
		(sqrt(3) / 4) * shape.side * shape.side
}

a(Circle(2.2)) is "Circle(2.2) area: 13.82"
a(EQLTriangle(3.9)) is "EQLTriangle(3.9) area: 6.59"
a(Circle(4.5)) is "Circle(4.5) area: 28.27"

checkSum(Circle(2.2)) is "935"
checkSum(EQLTriangle(3.9)) is "891"
checkSum(Circle(4.5)) is "935"