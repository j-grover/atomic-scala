// Solution-6.scala

// 6. Create a trait Shape with a method draw that returns a String.
// Create concrete Ellipse and Rectangle subclasses of Shape. Create a
// Circle subclass of Ellipse and a Square subclass of Rectangle.
// Create a Drawing class with a constructor that takes any number
// of Shape objects, and stores it internally in a Vector. Create draw
// methods for all these classes and an additional toString for
// Drawing. Satisfy the following tests:
// val drawing = new Drawing(
//  new Rectangle, new Square,
//  new Ellipse, new Circle)
// drawing.draw is "Vector(Rectangle," +
//  " Square, Ellipse, Circle)"
// drawing is "Rectangle, Square," +
//  " Ellipse, Circle" 

import com.atomicscala.AtomicTest._

trait Shape {
  def draw: String
}

class Ellipse extends Shape {
  override def draw = "Ellipse"
}

class Rectangle extends Shape {
  override def draw = "Rectangle"
}

class Circle extends Ellipse {
  override def draw = "Circle"
}

class Square extends Rectangle {
  override def draw = "Square"
}

class Drawing(shapes: Shape*) {
  val shapesVec = shapes.toVector
  override def toString = draw.mkString(", ")
  def draw = for (shape <- shapesVec) yield shape.draw
}

val drawing = new Drawing(
  new Rectangle, new Square,
  new Ellipse, new Circle
)

drawing.draw is "Vector(Rectangle, Square, Ellipse, Circle)"
drawing is "Rectangle, Square, Ellipse, Circle" 