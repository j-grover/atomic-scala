// Solution-3.scala

// 3. Modify CompoundExpressions2.scala to add a compound
// expression for goodTemperature. Pick a temperature (low and
// high) for each of the activities and determine if you want to do
// each activity based on both temperature and if a facility is open.
// Print the results of the comparisons to match the output described
// below. Do this with the following code, once you define the
// expression for goodTemperature.
// val doActivity = isOpen && goodTemperature
// println(activity + ": " + isOpen + " && " +
//  goodTemperature + " = " + doActivity)
// /* Output
// (run 4 times, once for each activity):
// swimming: false && false = false
// walking: true && true = true
// biking: true && false = false
// couch: true && true = true
// */

val activity = "swimming"
// val activity = "walking"
// val activity = "biking"
// val activity = "couch"

val temperature = 90
val hour = 3

val isOpen = {
    if(activity == "swimming") {
        val opens = 9
        val closes = 20
        println("Operating hours: " + opens + " - " + closes)
        if(hour >= opens && hour <= closes) { 
            true
        } else {
            false
        }
    } else {
        false
    }
}

val goodTemperature = {
    if(activity == "swimming") {
        if(temperature >= 90) true
        else false 
    } else if(activity == "biking") {
        if(temperature > 60) true
        else false
    } else true
}

var doActivity = isOpen && goodTemperature
println(activity + ": " + isOpen + " && " +
    goodTemperature + " = " + doActivity)