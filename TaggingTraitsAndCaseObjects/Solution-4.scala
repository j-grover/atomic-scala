// Solution-4.scala

// 4. Add another Red to the tagging trait Color. What happens? 

import com.atomicscala.AtomicTest._

sealed trait Color

case object Red extends Color
case object Green extends Color
case object Blue extends Color

object Color {
    val values = Vector(Red, Green, Blue, Red)
}

def display(c: Color) = c match {
    case Red => s"It's $c"
    case Green => s"It's $c"
    case Blue => s"It's $c"
}

Color.values.map(display) is "Vector(It's Red, It's Green, It's Blue)"

/* Results in:
Vector(It's Red, It's Green, It's Blue, It's Red)
[Error] expected:
Vector(It's Red, It's Green, It's Blue)
*/