// Solution-1.scala

// 1. Building from PatternMatchingCaseClasses.scala, define a new
// class Plane containing a Vector of Passengers and a name for the
// plane, so you can create a trip. Satisfy the following test:
// val trip2 = Vector(
// Train(travelers, "Reading"),
//  Plane(travelers, "B757"),
//  Bus(travelers, 100))
// travel(trip2(1)) is "Plane B757 " +
//  "Vector(Passenger(Harvey,Rabbit), " +
//  "Passenger(Dorothy,Gale))"

import com.atomicscala.AtomicTest._

case class Passenger(first: String, last: String)
case class Train(travelers: Vector[Passenger], line: String)
case class Bus(passengers: Vector[Passenger], capacity: Int)
case class Plane(passengers: Vector[Passenger], name: String)

def travel(transport: Any): String = {
    transport match {
        case Train(travelers, line) => s"Train line $line $travelers"
        case Bus(travelers, seats)  => s"Bus size $seats $travelers"
        case Passenger              => "Walking along"
        case Plane(travelers, name) => s"Plane $name $travelers"
        case what                   => s"$what is in limbo!"
    }
}

val travelers = Vector(
    Passenger("Harvey", "Rabbit"),
    Passenger("Dorothy", "Gale")
) 

val trip2 = Vector(
    Train(travelers, "Reading"),
    Plane(travelers, "B757"),
    Bus(travelers, 100)
)

travel(trip2(1)) is 
    "Plane B757 " +
    "Vector(Passenger(Harvey,Rabbit), " +
    "Passenger(Dorothy,Gale))"