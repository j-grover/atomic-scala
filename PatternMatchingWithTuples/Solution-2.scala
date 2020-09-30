// Solution-2.scala

// 2. Remove the default case from ColorBlend.scala. Satisfy the
// following tests:
// blend(red, yellow) is orange
// blend(red, red) is red
// blend(yellow,blue) is green 

import com.atomicscala.AtomicTest._
import paintcolors.Color
import paintcolors.Color._

def blend(a: Color, b: Color) =
    (a, b) match {
        case (`red`, `blue`) |
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

blend(red, yellow) is orange
blend(red, red) is red
blend(yellow, blue) is green