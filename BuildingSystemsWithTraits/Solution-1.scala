// Solution-1.scala

// 1. Rewrite Coffee.scala from Constructors using traits. Satisfy the
// following tests:
// Coffee(Single, Caf, Here, Skim, Choc) is
//  "Coffee(Single,Caf,Here,Skim,Choc)"
// Coffee(Double, Caf,
//  Here, NoMilk, NoFlavor) is
//  "Coffee(Double,Caf,Here,NoMilk,NoFlavor)"
// Coffee(Double,HalfCaf,ToGo,Skim,Choc) is
//  "Coffee(Double,HalfCaf,ToGo,Skim,Choc)"

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
    val Skim, NoMilk = Value
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
    milk: Milk,
    syrup: Syrup
)

Coffee(Single, Caf, Here, Skim, Choc) is 
    "Coffee(Single,Caf,Here,Skim,Choc)"
Coffee(Double, Caf, Here, NoMilk, NoFlavor) is
    "Coffee(Double,Caf,Here,NoMilk,NoFlavor)"
Coffee(Double,HalfCaf,ToGo,Skim,Choc) is
    "Coffee(Double,HalfCaf,ToGo,Skim,Choc)"