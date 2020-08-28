// Solution-1.scala

// 1. Add “Purple” to TaggingTrait.scala. Don’t add to the match
// expression. What happens? 
 
import com.atomicscala.AtomicTest._

sealed trait Color

case object Red extends Color
case object Green extends Color
case object Blue extends Color
case object Purple extends Color

object Color {
    val values = Vector(Red, Green, Blue)
}

def display(c: Color) = c match {
    case Red => s"It's $c"
    case Green => s"It's $c"
    case Blue => s"It's $c"
}

Color.values.map(display) is "Vector(It's Red, It's Green, It's Blue)"

/* Results in:
.\TaggingTraitsAndCaseObjects\Solution-1.scala:19: warning: match may not be exhaustive.
It would fail on the following input: Purple
def display(c: Color) = c match {
                        ^
Vector(It's Red, It's Green, It's Blue)
*/