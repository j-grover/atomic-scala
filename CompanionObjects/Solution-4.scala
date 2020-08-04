// Solution-4.scala

// 4. Vary the Metabolic Equivalent of Task based on speed of walking.
// Add the following MET method. Validate the method with tests.
// Did you put it in the class or the companion object? Update your
// calories method to call MET(mph). Satisfy the following tests:
// def MET(mph: Double) = mph match {
//  case x if(x < 1.7) => 2.3
//  case x if(x < 2.5) => 2.9
//  case x if(x < 3) => 3.3
//  case x if(x >= 3) => 3.3 
//  case _ => 2.3
// }
// WalkActivity4.MET(1.0) is 2.3
// WalkActivity4.MET(2.7) is 3.3
// val suzie = new WalkActivity4
// suzie.calories(150, 30) is 117
// val john = new WalkActivity4
// john.calories(150, 30, 1.5) is 82

import com.atomicscala.AtomicTest._

class WalkActivity4 {
    def calories(lbs: Int, mins: Int, mph: Double = 3): Long = 
        math.round((WalkActivity4.MET(mph) * 3.5 * lbs * 0.45) / 200.0 * mins)
}

object WalkActivity4 {
    var log = ""
    var MET = 2.3

    def start(name: String): Unit =
        log += s"[$name] Activity started.\n"
    
    def stop(name: String): Unit =
        log += s"[$name] Activity stopped.\n"
    
    def MET(mph: Double) = mph match {
        case x if (x < 1.7) => 2.3
        case x if (x < 2.5) => 2.9
        case x if (x < 3)   => 3.3
        case x if (x >= 3)  => 3.3 
        case _              => 2.3
    }
}

WalkActivity4.MET(1.0) is 2.3
WalkActivity4.MET(2.7) is 3.3

val suzie = new WalkActivity4
suzie.calories(150, 30) is 117

val john = new WalkActivity4
john.calories(150, 30, 1.5) is 82

// MET method added to companion object