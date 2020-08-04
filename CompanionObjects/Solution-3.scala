// Solution-3.scala

// 3. Add a field for Metabolic Equivalent of Task (MET) initialized to 2.3.
// Add the supplied method calories. Where did you put the field?
// Where did you put the method? If you didn’t put them in the
// companion object, do so now. Did you have to make any changes
// to do so? Satisfy the following tests:
// def calories(lbs:Int, mins:Int,
//  mph:Double=3):Long = math.round(
//  (MET * 3.5 * lbs * 0.45)/200.0 * mins
//  )
// val sally = new WalkActivity3
// sally.calories(150, 30) is 82

import com.atomicscala.AtomicTest._

class WalkActivity3 {
    def calories(lbs: Int, mins: Int, mph: Double = 3): Long = 
        math.round((WalkActivity3.MET * 3.5 * lbs * 0.45) / 200.0 * mins)
}

object WalkActivity3 {
    var log = ""
    var MET = 2.3

    def start(name: String): Unit =
        log += s"[$name] Activity started.\n"
    
    def stop(name: String): Unit =
        log += s"[$name] Activity stopped.\n"
}

val sally = new WalkActivity3
sally.calories(150, 30) is 82

// calories method needs to be in class