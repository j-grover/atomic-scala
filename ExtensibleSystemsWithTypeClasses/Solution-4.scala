// Solution-4.scala

// 4. Try duplicating lines 19-20 and 24 of Shape_Inheritance.scala in
// Shape_TypeClass.scala and see what happens. Why does this
// make sense? 

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

val shapes = Vector(Circle(2.2),
  EQLTriangle(3.9), Circle(4.5))

val result = for(s <- shapes) yield a(s)

a(Circle(2.2)) is "Circle(2.2) area: 13.82"
a(EQLTriangle(3.9)) is "EQLTriangle(3.9) area: 6.59"
a(Circle(4.5)) is "Circle(4.5) area: 28.27"

/* Results in:
.\ExtensibleSystemsWithTypeClasses\Solution-4.scala:36: error: could not find implicit value for parameter calc: this.Calc[Product with java.io.Serializable]
val result = for(s <- shapes) yield a(s)
                                     ^
*/                                     