// Solution-5.scala

// 5. Create a class Trip including origin, destination, start and end
// dates. Create a subclass AirplaneTrip, including the name of an inflight movie. Create a second subclass CarTrip, including a list of
// cities you will drive through. Satisfy the following tests:
// val t = new Trip("Detroit","Houston",
//  "5/1/2012","6/1/2012")
// val a = new AirplaneTrip("Detroit",
//  "London","9/1/1939",
//  "10/31/1939", "Superman")
// val cities = Vector("Boston",
//  "Albany","Buffalo","Cleveland",
//  "Columbus","Indianapolis",
//  "St. Louis", "Kansas City",
//  "Denver","Grand Junction",
//  "Salt Lake City","Las Vegas",
//  "Bakersfield","San Francisco")
// val c = new CarTrip(cities,
//  "6/1/2012","7/1/2012")
// c.origination is "Boston"
// c.destination is "San Francisco"
// c.startDate is "6/1/2012"
// t is "From Detroit to Houston:"
//  + " 5/1/2012 to 6/1/2012"
// a is "On a flight from Detroit to"
//  + " London, we watched Superman"
// c is "From Boston to San Francisco:"
//  + " 6/1/2012 to 7/1/2012"

import com.atomicscala.AtomicTest._

class Trip(
    val origination: String, 
    val destination: String, 
    val startDate: String, 
    val end: String
) {
    override def toString = s"From $origination to $destination: $startDate to $end"
}

class AirplaneTrip(
    origination: String,
    destination: String,
    startDate: String, 
    end: String,
    movie: String
) extends Trip(origination, destination, startDate, end) {
    override def toString = s"On a flight from $origination to $destination, we watched $movie"
}

class CarTrip(
    val cities: Vector[String],
    startDate: String,
    end: String
) extends Trip(cities.head, cities.last, startDate, end)

val t = new Trip("Detroit","Houston", "5/1/2012","6/1/2012")
val a = new AirplaneTrip("Detroit", "London","9/1/1939", "10/31/1939", "Superman")

val cities = Vector(
    "Boston", "Albany", "Buffalo",
    "Cleveland", "Columbus", "Indianapolis",
    "St. Louis", "Kansas City", "Denver",
    "Grand Junction", "Salt Lake City", "Las Vegas",
    "Bakersfield", "San Francisco"
)

val c = new CarTrip(cities, "6/1/2012", "7/1/2012")
c.origination is "Boston"
c.destination is "San Francisco"
c.startDate is "6/1/2012"

t is "From Detroit to Houston: 5/1/2012 to 6/1/2012"
a is "On a flight from Detroit to London, we watched Superman"
c is "From Boston to San Francisco: 6/1/2012 to 7/1/2012"