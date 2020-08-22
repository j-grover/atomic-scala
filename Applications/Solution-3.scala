// Solution-3.scala

// 3. Adding to your solution for the previous exercise, pass in an
// argument to represent the charge(s). Compile the application, then
// run it with the following shell command to verify the results:
// scala Battery2 80 30 10
// Hint: recall that you can convert from a String to an Int using toInt. 

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

class Battery2 extends EnergySource with BatteryPower

object Battery2 extends App {
    val battery = new Battery2
    for (arg <- args)
        println(battery.monitor(arg.toInt))
}