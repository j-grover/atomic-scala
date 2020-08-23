// Solution-3.scala

// 3. Start with your solution for Exercise 2. Change the arguments for
// Robot to allow more than one ability. Use mkString in your
// overridden toString. Satisfy the following tests:
// val bot = new Robot(
//  Vector(
//  Mobility("Propeller"),
//  Mobility("Legs")),
//  Vector(
//  Vision("UV"),
//  Vision("Visible Spectrum")),
//  Vector(
//  Manipulator("Magnet"),
//  Manipulator("Claw"))
// )
// bot is "Mobility(Propeller)," +
// " Mobility(Legs) | Vision(UV)," +
// " Vision(Visible Spectrum) | " +
// "Manipulator(Magnet), " +
// "Manipulator(Claw)"

import com.atomicscala.AtomicTest._

case class Mobility(mobility: String)

case class Vision(vision: String)

case class Manipulator(manipulator: String)

case class Robot(
    mobility: Vector[Mobility], 
    vision:  Vector[Vision], 
    manipulator: Vector[Manipulator]
) {
    override def toString =
        mobility.mkString(", ") + " | " +
        vision.mkString(", ") + " | " +
        manipulator.mkString(", ")
}

val bot = new Robot(
    Vector(
        Mobility("Propeller"),
        Mobility("Legs")
    ),
    Vector(
        Vision("UV"),
        Vision("Visible Spectrum")
    ),
    Vector(
        Manipulator("Magnet"),
        Manipulator("Claw")
    )
)

bot is "Mobility(Propeller)," + 
    " Mobility(Legs) | Vision(UV)," + 
    " Vision(Visible Spectrum) | " + 
    "Manipulator(Magnet), "  + 
    "Manipulator(Claw)"