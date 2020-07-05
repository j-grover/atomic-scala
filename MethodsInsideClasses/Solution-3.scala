// Solution-3.scala

// 3. In each of the Sailboat and Motorboat classes, add a method signal
// that creates a Flare object and calls the light method on the Flare.
// Satisfy the following:
// val sailboat2 = new Sailboat2
// val signal = sailboat2.signal()
// assert(signal == "Flare used!",
//  "Expected Flare used! Got " + signal)
// val motorboat2 = new Motorboat2
// val flare2 = motorboat2.signal()
// assert(flare2 == "Flare used!",
//  "Expected Flare used!, Got " + flare2) 

class Sailboat2 {
    def raise(): String = "Sails raised"
    def lower(): String = "Sails lowered"
    def signal(): String = {
        val flare = new Flare
        flare.light
    }
}

class Motorboat2 {
    def on(): String = "Motor on"
    def off(): String = "Motor off"
    def signal(): String = {
        val flare = new Flare
        flare.light
    }
}

class Flare {
    def light(): String = "Flare used!"
}

val sailboat2 = new Sailboat2
val signal = sailboat2.signal()
println(signal)
assert(signal == "Flare used!",
 "Expected Flare used! Got " + signal)

val motorboat2 = new Motorboat2
val flare2 = motorboat2.signal()
println(flare2)
assert(flare2 == "Flare used!",
 "Expected Flare used!, Got " + flare2) 