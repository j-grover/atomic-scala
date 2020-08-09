// Solution-1.scala

// 1. Create a trait BatteryPower to report remaining charge. If the
// charge is greater than 40%, report “green.” If the charge is between
// 20-39%, report “yellow.” If the charge is less than 20%, report “red.”
// Instantiate the trait and satisfy the following tests:
// class Battery extends
//  EnergySource with BatteryPower
// val battery = new Battery
// battery.monitor(80) is "green"
// battery.monitor(30) is "yellow"
// battery.monitor(10) is "red"
 
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

val battery = new Battery
battery.monitor(80) is "green"
battery.monitor(30) is "yellow"
battery.monitor(10) is "red"