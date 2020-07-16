// Solution-4.scala

// 4. Modify your solution for the previous exercise by changing the
// order of the arguments that you use to create the Planet. Did you
// have to change any code? Satisfy the following test:
// val earth = new Planet(moons = 1,
//  name = "Earth",
//  description = "a hospitable planet")
// earth.hasMoon is true

import com.atomicscala.AtomicTest._

class Planet(name: String, description: String, moons: Int = 1) {
    def hasMoon(): Boolean = {
        if (moons > 0) return true
        false
    }
}

val earth = new Planet(
    moons = 1,
    name = "Earth",
    description = "a hospitable planet"
)
earth.hasMoon is true

// No code changes were required