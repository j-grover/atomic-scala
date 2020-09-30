// Solution-3.scala

// 3. Add another color (magenta) to PaintColors.scala and verify that
// the rest of the examples in the atom still work correctly. Satisfy
// the following tests:
// blend2(red, yellow) is orange
// blend2(red, red) is red
// blend2(yellow,blue) is green
// blend2(yellow, magenta) is purple
// blend2(red, magenta) is purple

import com.atomicscala.AtomicTest._
import paintcolors.Color
import paintcolors.Color._

def blend2(a: Color, b: Color) =
    (a, b) match {
        case _ if a == b => a
        case (`red`, `blue`) |
            (`blue`, `red`) => purple
        case (`red`, `yellow`) |
            (`yellow`, `red`) => orange
        case (`blue`, `yellow`) |
            (`yellow`, `blue`) => green
        case (`magenta`, `yellow`) |
            (`yellow`, `magenta`) => purple
        case (`red`, `magenta`) |
            (`magenta`, `red`) => purple
        case (`brown`, _) |
            (_, `brown`) => brown
        case _ => // Interesting, not accurate:
            Color((a.id + b.id) % Color.maxId)
    }

blend2(red, yellow) is orange
blend2(red, red) is red
blend2(yellow, blue) is green
blend2(yellow, magenta) is purple
blend2(red, magenta) is purple