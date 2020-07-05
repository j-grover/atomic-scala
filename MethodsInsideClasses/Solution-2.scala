// Solution-2.scala

// 2. Create a new class Flare. Define a light method in the Flare class.
// Satisfy the following:
// val flare = new Flare
// val f1 = flare.light
// assert(f1 == "Flare used!",
//  "Expected Flare used!, Got " + f1)

class Flare {
    def light(): String = "Flare used!"
}

val flare = new Flare
val f1 = flare.light
println(f1)
assert(f1 == "Flare used!",
 "Expected Flare used!, Got " + f1)