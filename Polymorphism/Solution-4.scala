// Solution-4.scala

// 4. In the definition of Character on line 39 of Polymorphism.scala, we
// use a var for the player, and then change the player on line 51. Use
// a val to accomplish the same thing. Satisfy the following test:
// class Character(val player:String="None")
//  extends Element
// // Change the next line
// class Dragon extends Character
// val d = new Dragon("Puff")
// d.player is "Puff"

import com.atomicscala.AtomicTest._
import com.atomicscala.Name

class Element extends Name {
    def interact(other: Element) =
        s"$this interact $other"

    def draw = "Drawing the element"
}

class Character(val player: String = "None") extends Element

class Dragon(val dPlayer: String) extends Character(dPlayer)

val d = new Dragon("Puff")
d.player is "Puff"