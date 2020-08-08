// Solution-3.scala

// 3. Rework your solution for the Trip, AirplaneTrip, and CarTrip
// exercises in Base Class Initialization, using super on the toString
// method from the base class rather than duplicating the code. Start
// with the same setup as before, but satisfy these tests:
// t is "From Detroit to Houston:" +
//  " 5/1/2012 to 6/1/2012"
// a is
//  "From Detroit to London:" +
//  " 9/1/1939 to 10/31/1939" +
//  ", we watched Superman"
// c.origination is "Boston"
// c.destination is "San Francisco"
// c.startDate is "6/1/2012"
// c is "From Boston to San Francisco:" +
//  " 6/1/2012 to 7/1/2012, we visited" +
//  " Vector(Albany, Buffalo, " +
//  "Cleveland, Columbus, Indianapolis," +
//  " St. Louis, Kansas City, Denver, " +
//  "Grand Junction, Salt Lake City, " +
//  "Las Vegas, Bakersfield)"

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
    override def toString = super.toString + s", we watched $movie"
}

class CarTrip(
    val cities: Vector[String],
    startDate: String,
    end: String
) extends Trip(cities.head, cities.last, startDate, end) {
    override def toString = super.toString + s", we visited ${cities.slice(1, cities.size - 1)}"
}

val t = new Trip("Detroit", "Houston", "5/1/2012","6/1/2012")
val a = new AirplaneTrip("Detroit", "London", "9/1/1939", "10/31/1939", "Superman")

val cities = Vector(
    "Boston", "Albany", "Buffalo",
    "Cleveland", "Columbus", "Indianapolis",
    "St. Louis", "Kansas City", "Denver",
    "Grand Junction", "Salt Lake City", "Las Vegas",
    "Bakersfield", "San Francisco"
)

val c = new CarTrip(cities, "6/1/2012", "7/1/2012")

t is 
    "From Detroit to Houston:" +
    " 5/1/2012 to 6/1/2012"

a is
    "From Detroit to London:" +
    " 9/1/1939 to 10/31/1939" +
    ", we watched Superman"

c.origination is "Boston"
c.destination is "San Francisco"
c.startDate is "6/1/2012"

c is 
    "From Boston to San Francisco:" +
    " 6/1/2012 to 7/1/2012, we visited" +
    " Vector(Albany, Buffalo, " +
    "Cleveland, Columbus, Indianapolis," +
    " St. Louis, Kansas City, Denver, " +
    "Grand Junction, Salt Lake City, " +
    "Las Vegas, Bakersfield)"