// Solution-8.scala

// 8. Show what happens if you try to inherit from a case class. 

import com.atomicscala.AtomicTest._

case class Human(name: String)

class Male(name: String) extends Human(name)

val man = new Male("Bob")
man is "Human(Bob)"

// Works as expected (class inheriting case class)

case class Vehicle(name: String)

case class Truck(name: String) extends Vehicle(name)

/* Results in:
.\BaseClassInitialization\Solution-8.scala:18: error: case class Truck has case ancestor Main.$anon.Vehicle, but case-to-case inheritance is prohibited. To overcome this limitation, use extractors to pattern match on non-leaf nodes.
case class Truck(name: String) extends Vehicle(name)

Case class cannot inherit case class
*/