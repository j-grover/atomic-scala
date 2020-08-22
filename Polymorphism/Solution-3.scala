// Solution-3.scala

// 3. Building on the previous exercise, add a new draw method to Wall
// (that is, don’t use the Inert draw method). Satisfy the following
// test:
// val wall = new Wall
// wall.draw is "Don't draw on the wall!"

import com.atomicscala.AtomicTest._
import com.atomicscala.Name

class Element extends Name {
    def interact(other: Element) =
        s"$this interact $other"

    def draw = "Drawing the element"
}

class Inert extends Element {
    override def draw = "Inert drawing!"
}

class Wall extends Inert {
    override def draw = "Don't draw on the wall!"
}

val wall = new Wall
wall.draw is "Don't draw on the wall!"