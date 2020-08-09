// Solution-2.scala

// 2. Create a new class Toy. Use Toy and BatteryPower to create a new
// class BatteryPoweredToy. Satisfy the following tests:
// val toy = new BatteryPoweredToy
// toy.monitor(50) is "green"

import com.atomicscala.AtomicTest._

trait BatteryPower {
    def monitor(charge: Int) = {
        charge match {
            case x if (x >= 40)             => "green"
            case x if (x >= 20 && x <= 39)  => "yellow"
            case _                          => "red"
        }
    }
}

class Toy 

class BatteryPoweredToy extends Toy with BatteryPower

val toy = new BatteryPoweredToy
toy.monitor(50) is "green"