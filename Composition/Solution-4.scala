// Solution-4.scala

// 4. Modify your solution for Exercise 3 so the case classes inherit from
// a trait Ability, and change Robot to take a single Vector[Ability].
// Satisfy the following tests:
// val bot = new Robot(
//  Vector(Mobility("Propeller"),
//  Mobility("Legs"),
//  Vision("UV"),
//  Vision("Visible Spectrum"), 
//  Manipulator("Magnet"),
//  Manipulator("Claw"))
// )
// bot is "Mobility(Propeller), " +
// "Mobility(Legs), Vision(UV), " +
// "Vision(Visible Spectrum), " +
// "Manipulator(Magnet), " +
// "Manipulator(Claw)"

import com.atomicscala.AtomicTest._

trait Ability

case class Mobility(mobility: String) extends Ability

case class Vision(vision: String) extends Ability

case class Manipulator(manipulator: String) extends Ability

case class Robot(ability: Vector[Ability]) {
    override def toString = s"${ability.mkString(", ")}"
}

val bot = new Robot(
    Vector(
        Mobility("Propeller"),
        Mobility("Legs"),
        Vision("UV"),
        Vision("Visible Spectrum"), 
        Manipulator("Magnet"),
        Manipulator("Claw")
    )
)

bot is "Mobility(Propeller), " +
    "Mobility(Legs), Vision(UV), " +
    "Vision(Visible Spectrum), " +
    "Manipulator(Magnet), " +
    "Manipulator(Claw)"