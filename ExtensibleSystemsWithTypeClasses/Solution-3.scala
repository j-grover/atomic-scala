// Solution-3.scala

// 3. Add a new class to Shape_TypeClass.scala but do not create an
// associated Calc class. Try to use it and see what happens. 

import com.atomicscala.AtomicTest._
import scala.math.{Pi, sqrt}

trait Calc[S] {
	def area(shape: S): Double
}

def a[S](shape: S)(implicit calc: Calc[S]) =
	f"$shape area: ${calc.area(shape)}%2.2f"

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

case class Rectangle(width: Double, length: Double)

a(Circle(2.2)) is "Circle(2.2) area: 13.82"
a(EQLTriangle(3.9)) is "EQLTriangle(3.9) area: 6.59"
a(Circle(4.5)) is "Circle(4.5) area: 28.27"
a(Rectangle(2.5, 2.0)) is "Rectangle(2.5,2.0) area: 5.00"

/* Results in:
.\ExtensibleSystemsWithTypeClasses\Solution-3.scala:37: error: could not find implicit value for parameter calc: this.Calc[this.Rectangle]
a(Rectangle(2.5, 2.0)) is "Rectangle(2.5,2.0) area: 5.00"
 ^
*/