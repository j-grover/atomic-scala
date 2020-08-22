// Solution-2.scala

// 2. In Exercise 1 from Traits, you implemented a class called Battery.
// Rework that as an application (hint: use a companion object). Run
// the same tests inside the application object. 

import com.atomicscala.AtomicTest._

trait EnergySource

trait BatteryPower {
    def monitor(charge: Int) = {
        charge match {
            case x if (x >= 40)             => "green"
            case x if (x >= 20 && x <= 39)  => "yellow"
            case _                          => "red"
        }
    }
}

class Battery extends EnergySource with BatteryPower

object Battery extends App {
    val battery = new Battery
    battery.monitor(80) is "green"
    battery.monitor(30) is "yellow"
    battery.monitor(10) is "red"
}