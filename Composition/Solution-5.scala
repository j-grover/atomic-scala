// Solution-5.scala

// 5. Modify your solution for Exercise 3 to implement a “builder”
// approach. Robot has no constructor arguments, but instead has
// methods to addMobility, addVision and addManipulator. Satisfy
// the following tests:
// val bot = new Robot
// bot.addMobility(
//  Mobility("Propeller"))
// bot.addMobility(
//  Mobility("Legs"))
// bot.addVision(
//  Vision("UV"))
// bot.addVision(Vision(
//  "Visible Spectrum"))
// bot.addManipulator(
//  Manipulator("Magnet"))
// bot.addManipulator(
//  Manipulator("Claw"))
// bot is "Mobility(Propeller)," +
// " Mobility(Legs) | Vision(UV)," +
// " Vision(Visible Spectrum) | " +
// "Manipulator(Magnet)," +
// " Manipulator(Claw)"
  
import com.atomicscala.AtomicTest._

case class Mobility(mobility: String)

case class Vision(vision: String)

case class Manipulator(manipulator: String)

class Robot {
    var mobility = Vector[Mobility]()
    var vision = Vector[Vision]()
    var manipulator = Vector[Manipulator]()

    def addMobility(mob: Mobility) = mobility = mobility :+ mob
    def addVision(vis: Vision) = vision = vision :+ vis
    def addManipulator(manip: Manipulator) = manipulator = manipulator :+ manip

    override def toString =
        mobility.mkString(", ") + " | " +
        vision.mkString(", ") + " | " +
        manipulator.mkString(", ")
}

val bot = new Robot

bot.addMobility(Mobility("Propeller"))
bot.addMobility(Mobility("Legs"))
bot.addVision(Vision("UV"))
bot.addVision(Vision("Visible Spectrum"))
bot.addManipulator(Manipulator("Magnet"))
bot.addManipulator(Manipulator("Claw"))

bot is "Mobility(Propeller)," +
    " Mobility(Legs) | Vision(UV)," +
    " Vision(Visible Spectrum) | " +
    "Manipulator(Magnet)," +
    " Manipulator(Claw)"