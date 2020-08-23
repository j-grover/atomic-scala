// Solution-1.scala

// 1. Create a trait Mobility with a String method mobility that returns a
// description of the type of mobility. Create similar traits for Vision
// and Manipulator. Inherit a class Robot that takes mobility, vision,
// and manipulator arguments, and overrides toString. Satisfy the
// following tests:
// val walker = new Robot("Legs",
//  "Visible Spectrum", "Magnet")
// walker is
//  "Legs, Visible Spectrum, Magnet"
// val crawler = new Robot("Treads",
//  "Infrared", "Claw")
// crawler is "Treads, Infrared, Claw"
// val arial = new Robot("Propeller",
//  "UV", "None")
// arial is "Propeller, UV, None" 
 
import com.atomicscala.AtomicTest._

trait Mobility {
    def mobility: String
}

trait Vision {
    def vision: String
}

trait Manipulator {
    def manipulator: String
}

class Robot(
    val mobility: String, 
    val vision: String, 
    val manipulator: String
) extends Mobility with Vision with Manipulator {
    override def toString = s"$mobility, $vision, $manipulator" 
}

val walker = new Robot("Legs", "Visible Spectrum", "Magnet")
walker is "Legs, Visible Spectrum, Magnet"

val crawler = new Robot("Treads", "Infrared", "Claw")
crawler is "Treads, Infrared, Claw"

val arial = new Robot("Propeller", "UV", "None")
arial is "Propeller, UV, None"