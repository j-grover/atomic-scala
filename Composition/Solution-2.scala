// Solution-2.scala

// 2. Start with your solution to Exercise 1. Turn the traits into case
// classes. Make those classes the arguments to class Robot. Satisfy
// the following tests:
// val walker = new Robot(
//  Mobility("Legs"),
//  Vision("Visible Spectrum"),
//  Manipulator("Magnet"))
// walker is "Mobility(Legs), " +
//  "Vision(Visible Spectrum)," +
//  " Manipulator(Magnet)"
// val crawler = new Robot(
//  Mobility("Treads"),
//  Vision("Infrared"),
//  Manipulator("Claw"))
// crawler is "Mobility(Treads)," +
//  " Vision(Infrared), " +
//  "Manipulator(Claw)" 
// val arial = new Robot(
//  Mobility("Propeller"),
//  Vision("UV"),
//  Manipulator("None"))
// arial is "Mobility(Propeller)," +
//  " Vision(UV), Manipulator(None)"

import com.atomicscala.AtomicTest._

case class Mobility(mobility: String)

case class Vision(vision: String)

case class Manipulator(manipulator: String)

case class Robot(
    mobility: Mobility, 
    vision:  Vision, 
    manipulator: Manipulator
) {
    override def toString = s"$mobility, $vision, $manipulator" 
}

val walker = new Robot(
    Mobility("Legs"),
    Vision("Visible Spectrum"),
    Manipulator("Magnet")
)
walker is "Mobility(Legs), Vision(Visible Spectrum), Manipulator(Magnet)"

val crawler = new Robot(
    Mobility("Treads"),
    Vision("Infrared"),
    Manipulator("Claw")
)
crawler is "Mobility(Treads), Vision(Infrared), Manipulator(Claw)" 

val arial = new Robot(
    Mobility("Propeller"),
    Vision("UV"),
    Manipulator("None")
)
arial is "Mobility(Propeller), Vision(UV), Manipulator(None)"