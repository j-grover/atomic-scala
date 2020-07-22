// Solution-2.scala

// 2. Use GardenGnome’s magic method with String Interpolation. Add
// a method show that takes one parameter, level, and calls
// magic(level) in place of height and width. Satisfy the following
// tests:
// val gnome =
//  new GardenGnome(20.0, 50.0, false)
// gnome.show(87) is "Poof! 87 false true"
// val bob = new GardenGnome("Bob")
// bob.show(25) is "Poof! 25 true true"

import com.atomicscala.AtomicTest._

case class GardenGnome(height: Double, weight: Double, happy: Boolean) {
    var painted = true
    def this(height: Double) {
        this(height, 100.0, true)
    }
    def this(name: String) = {
        this(15.0)
    }
    def show(level: Int): String = {
        magic(level)
    }
    def magic(level: Int): String = {
        s"Poof! $level $happy $painted"
    }
}

val gnome = new GardenGnome(20.0, 50.0, false)
gnome.show(87) is "Poof! 87 false true"

val bob = new GardenGnome("Bob")
bob.show(25) is "Poof! 25 true true"
