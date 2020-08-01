// Solution-3.scala

// 3. Building on your solution for Exercise 2, determine if you must
// make any changes to pass in a Kitten. Satisfy the following test:
// case class Kitten(name:String)
// travel2(Kitten("Kitty")) is
//  "Kitten(Kitty) is in limbo!"

import com.atomicscala.AtomicTest._

case class Passenger(first: String, last: String)
case class Train(travelers: Vector[Passenger], line: String)
case class Bus(passengers: Vector[Passenger], capacity: Int)
case class Plane(passengers: Vector[Passenger], name: String)

def travel2(transport: Any): String = {
    transport match {
        case Train(travelers, line) => s"Train line $line $travelers"
        case Bus(travelers, seats)  => s"Bus size $seats $travelers"
        case Passenger(first, _)    => s"$first is walking"
        case Plane(travelers, name) => s"Plane $name $travelers"
        case what                   => s"$what is in limbo!"
    }
}

case class Kitten(name:String)
travel2(Kitten("Kitty")) is "Kitten(Kitty) is in limbo!"

// No changes required, handled by case "what"