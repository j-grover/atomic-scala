// Solution-4.scala

// 4. Import sodafountain, and add a Container with Pint, Quart and
// HalfGallon. Create a TakeHome class with arguments of type
// Container and Flavor. Satisfy the following tests:
// TakeHome(Pint, Chocolate) is
//  "TakeHome(Pint,Chocolate)"
// TakeHome(Quart, Strawberry) is
//  "TakeHome(Quart,Strawberry)"
// TakeHome(HalfGallon, Vanilla) is
//  "TakeHome(HalfGallon,Vanilla)" 

import com.atomicscala.AtomicTest._
import sodafountain._
import IceCream._

object Container extends Enumeration {
    type Container = Value
    val Pint, Quart, HalfGallon = Value
}

import Container._

case class TakeHome(container: Container, flavor: Flavor)

TakeHome(Pint, Chocolate) is "TakeHome(Pint,Chocolate)"
TakeHome(Quart, Strawberry) is "TakeHome(Quart,Strawberry)"
TakeHome(HalfGallon, Vanilla) is "TakeHome(HalfGallon,Vanilla)"