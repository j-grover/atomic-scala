// Solution-3.scala

// 3. A mocha is a variant of a latte, with chocolate. Satisfy the
// following tests:
// val mocha = new Mocha(Double,Caf,ToGo,Skim)
// mocha is "Mocha(Double,Caf,ToGo,Skim,Choc)"

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

class Mocha(
    shots: Shots,
    caffeine: Caffeine,
    orderType: OrderType,
    milk: Milk
) extends Latte(shots, caffeine, orderType, milk) {
    val flavor = Choc
    override def toString = s"Mocha($shots,$caffeine,$orderType,$milk,$flavor)"
}

val mocha = new Mocha(Double, Caf, ToGo, Skim)
mocha is "Mocha(Double,Caf,ToGo,Skim,Choc)"