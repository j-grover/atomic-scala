// Solution-1.scala

// 1. The Garden Gnome example in Auxiliary Constructors has a show
// method to display information about a gnome. Rewrite show using
// String interpolation. Satisfy the following tests:
// val gnome =
//  new GardenGnome(20.0, 110.0, false)
// gnome.show() is "20.0 110.0 false true"
// val bob = new GardenGnome("Bob")
// bob.show() is "15.0 100.0 true true"
 
import com.atomicscala.AtomicTest._

case class GardenGnome(height: Double, weight: Double, happy: Boolean) {
    var painted = true
    def this(height: Double) {
        this(height, 100.0, true)
    }
    def this(name: String) = {
        this(15.0)
    }
    def show(): String = {
        s"$height $weight $happy $painted"
    }
}

val gnome = new GardenGnome(20.0, 110.0, false)
gnome.show() is "20.0 110.0 false true"

val bob = new GardenGnome("Bob")
bob.show() is "15.0 100.0 true true"