// Solution-2.scala

// 2. Assume a latte is a coffee with milk. Create a new class Latte.
// Simplify the Milk trait to remove NoMilk. Coffee should no longer
// take Milk as a class argument. Did you implement Coffee as a
// trait? Why or why not? Satisfy the following tests:
// val latte = new Latte(Single, Caf,
//  Here, Skim)
// latte is "Latte(Single,Caf,Here,Skim)"
// val usual = new Coffee(Double, Caf, Here)
// usual is "Coffee(Double,Caf,Here)"

import com.atomicscala.AtomicTest._

object Shots extends Enumeration {
    type Shots = Value
    val Single, Double = Value
}

object Caffeine extends Enumeration {
    type Caffeine = Value
    val Caf, Decaf, HalfCaf = Value
}

object OrderType extends Enumeration {
    type OrderType = Value
    val Here, ToGo = Value
}

object Milk extends Enumeration {
    type Milk = Value
    val Skim, Full = Value
}

object Syrup extends Enumeration {
    type Syrup = Value
    val Choc, NoFlavor = Value
}

import Shots._
import Caffeine._
import OrderType._
import Milk._
import Syrup._

case class Coffee(
    shots: Shots,
    caffeine: Caffeine,
    orderType: OrderType,
    syrup: Syrup = NoFlavor
) {
    override def toString = s"Coffee($shots,$caffeine,$orderType)"
}

class Latte(
    shots: Shots,
    caffeine: Caffeine,
    orderType: OrderType,
    milk: Milk
) extends Coffee(shots, caffeine, orderType) {
    override def toString = s"Latte($shots,$caffeine,$orderType,$milk)"
}

val latte = new Latte(Single, Caf, Here, Skim)
latte is "Latte(Single,Caf,Here,Skim)"

val usual = new Coffee(Double, Caf, Here)
usual is "Coffee(Double,Caf,Here)"