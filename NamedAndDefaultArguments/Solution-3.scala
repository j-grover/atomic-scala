// Solution-3.scala

// 3. Create a class Planet that has, by default, a single moon. The
// Planet class should have a name (String) and description (String).
// Use named arguments to specify the name and description, and a
// default for the number of moons. Satisfy the following test:
// val p = new Planet(name = "Mercury",
//  description = "small and hot planet",
//  moons = 0)
// p.hasMoon is false

import com.atomicscala.AtomicTest._

class Planet(name: String, description: String, moons: Int = 1) {
    def hasMoon(): Boolean = {
        if (moons > 0) return true
        false
    }
}

val p = new Planet(
    name = "Mercury", 
    description = "small and hot planet",
    moons = 0
)
p.hasMoon is false