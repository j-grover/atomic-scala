// Solution-6.scala

// 6. Modify your solution for Exercise 5 to turn the “add” methods into
// overloaded ‘+’ operators. For chaining, you must return this from
// each operator. Compare all the solutions for this atom. Satisfy the
// following tests:
// val bot = new Robot +
//  Mobility("Propeller") +
//  Mobility("Legs") +
//  Vision("UV") +
//  Vision("Visible Spectrum") +
//  Manipulator("Magnet") +
//  Manipulator("Claw")
// bot is "Mobility(Propeller)," +
// " Mobility(Legs) | Vision(UV)," +
// " Vision(Visible Spectrum) |" +
// " Manipulator(Magnet)," +
// " Manipulator(Claw)"

import com.atomicscala.AtomicTest._

case class Mobility(mobility: String)

case class Vision(vision: String)

case class Manipulator(manipulator: String)

class Robot {
    var mobility = Vector[Mobility]()
    var vision = Vector[Vision]()
    var manipulator = Vector[Manipulator]()

    def +(mob: Mobility) = {
      mobility = mobility :+ mob
      this
    }

    def +(vis: Vision) = {
      vision = vision :+ vis
      this
    }
    
    def +(manip: Manipulator) = {
      manipulator = manipulator :+ manip
      this
    }

    override def toString =
      mobility.mkString(", ") + " | " +
      vision.mkString(", ") + " | " +
      manipulator.mkString(", ")
}

val bot = new Robot +
  Mobility("Propeller") +
  Mobility("Legs") +
  Vision("UV") +
  Vision("Visible Spectrum") +
  Manipulator("Magnet") +
  Manipulator("Claw")

bot is "Mobility(Propeller)," +
  " Mobility(Legs) | Vision(UV)," +
  " Vision(Visible Spectrum) |" +
  " Manipulator(Magnet)," +
  " Manipulator(Claw)"