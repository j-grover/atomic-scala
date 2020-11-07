// Solution-5.scala

// 5. Create a type class trait called Reporter with a method generate.
// Write a method report that takes any object and its associated
// Reporter and produces a String (using generate) containing
// information about that object. Create case classes Person, Store
// and Vehicle, each containing different types of information. Create
// their associated Reporter objects and show that your type class
// system works correctly. 

import com.atomicscala.AtomicTest._

trait Reporter[O] {
    def generate(obj: O): String
}

def report[O](obj: O)(implicit reporter: Reporter[O]) =
    s"Info about $obj - ${reporter.generate(obj)}"

case class Person(name: String)

implicit object Person extends Reporter[Person] {
    def generate(obj: Person) = s"Name: ${obj.name}"
}

case class Store(location: String)

implicit object Store extends Reporter[Store] {
    def generate(obj: Store) = s"Location: ${obj.location}"
}

case class Vehicle(mode: String)

implicit object Vehicle extends Reporter[Vehicle] {
    def generate(obj: Vehicle) = s"Type: ${obj.mode}"
}

report(Person("Bob")) is "Info about Person(Bob) - Name: Bob"
report(Store("Sydney")) is "Info about Store(Sydney) - Location: Sydney"
report(Vehicle("Car")) is "Info about Vehicle(Car) - Type: Car"