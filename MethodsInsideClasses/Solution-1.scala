// Solution-1.scala

// 1. Create a Sailboat class with methods to raise and lower the sails,
// printing “Sails raised,” and “Sails lowered,” respectively. Create a
// Motorboat class with methods to start and stop the motor,
// returning “Motor on,” and “Motor off,” respectively. Make an object
// (instance) of the Sailboat class. Use assert for verification:
// val sailboat = new Sailboat
// val r1 = sailboat.raise()
// assert(r1 == "Sails raised",
//  "Expected Sails raised, Got " + r1)
// val r2 = sailboat.lower()
// assert(r2 == "Sails lowered",
//  "Expected Sails lowered, Got " + r2)
// val motorboat = new Motorboat 
// val s1 = motorboat.on()
// assert(s1 == "Motor on",
//  "Expected Motor on, Got " + s1)
// val s2 = motorboat.off()
// assert(s2 == "Motor off",
//  "Expected Motor off, Got " + s2)

class Sailboat {
    def raise(): String = "Sails raised"
    def lower(): String = "Sails lowered"
}

class Motorboat {
    def on(): String = "Motor on"
    def off(): String = "Motor off"
}

val sailboat = new Sailboat
val r1 = sailboat.raise()
println(r1)
assert(r1 == "Sails raised",
 "Expected Sails raised, Got " + r1)
val r2 = sailboat.lower()
println(r2)
assert(r2 == "Sails lowered",
 "Expected Sails lowered, Got " + r2)

val motorboat = new Motorboat 
val s1 = motorboat.on()
println(s1)
assert(s1 == "Motor on",
 "Expected Motor on, Got " + s1)
val s2 = motorboat.off()
println(s2)
assert(s2 == "Motor off",
 "Expected Motor off, Got " + s2)