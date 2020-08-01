// Solution-2.scala

// 2. Building on your solution for Exercise 1, change the case for
// Passenger so it extracts the object. Satisfy the following test:
// travel2(Passenger("Sally", "Marie")) is
//  "Sally is walking"

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

travel2(Passenger("Sally", "Marie")) is "Sally is walking"