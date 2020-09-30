// Solution-1.scala

// 1. Remove the backticks from one of the labels in ColorBlend.scala
// and see what error message is produced. 
 
import com.atomicscala.AtomicTest._
import paintcolors.Color
import paintcolors.Color._

package object colorblend {

def blend(a: Color, b: Color) =
    (a, b) match {
        case _ if a == b => a
        case (red, `blue`) |
            (`blue`, `red`) => purple
        case (`red`, `yellow`) |
            (`yellow`, `red`) => orange
        case (`blue`, `yellow`) |
            (`yellow`, `blue`) => green
        case (`brown`, _) |
            (_, `brown`) => brown
        case _ => // Interesting, not accurate:
            Color((a.id + b.id) % Color.maxId)
    }

}

/* Results in:
.\PatternMatchingWithTuples\Solution-1.scala:15: error: illegal variable in pattern alternative
        case (red, `blue`) |
              ^
1 error
*/