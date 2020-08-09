// Solution-3.scala

// 3. Instantiate an object without creating an intermediate class, using
// Toy and BatteryPower directly. Satisfy the following test:
// val toy2 = new // Fill this in
// toy2.monitor(50) is "green"

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

val toy2 = new Toy with BatteryPower
toy2.monitor(50) is "green"