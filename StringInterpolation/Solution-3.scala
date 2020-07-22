// Solution-3.scala

// 3. Rework your solution for Exercise 1 to display height and weight
// with labels. Satisfy the following tests:
// val gnome =
//  new GardenGnome(20.0, 110.0, false) 
//  gnome.show() is "height: 20.0 " +
// "weight: 110.0 happy: false painted: true"
// val bob = new GardenGnome("Bob")
// bob.show() is
// "height: 15.0 weight: 100.0 true true" 

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
        s"height: $height weight: $weight happy: $happy painted: $painted"
    }
}

val gnome = new GardenGnome(20.0, 110.0, false) 
gnome.show() is "height: 20.0 weight: 110.0 happy: false painted: true"

val bob = new GardenGnome("Bob")
bob.show() is "height: 15.0 weight: 100.0 happy: true painted: true" 