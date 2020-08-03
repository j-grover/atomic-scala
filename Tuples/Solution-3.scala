// Solution-3.scala

// 3. Create a method weather that takes arguments for temperature
// and humidity. Your method will return “Hot” if the temp is above
// 80 degrees and “Cold” if the temperature is below 50 degrees.
// Otherwise, return “Temperate.” Your method will also return
// “Humid” if humidity is above 40%, unless the temperature is below
// 50. In that case, it should return “Damp.” Otherwise, return
// “Pleasant.” Write tests for the above conditions, and also satisfy
// the following tests:
// weather(81, 45) is ("Hot", "Humid")
// weather(50, 45) is ("Temperate", "Humid")

import com.atomicscala.AtomicTest._

def weather(temp: Double, hum: Double) = {
    val tempOut = temp match {
        case t: Double if (t > 80)  => "Hot"
        case t: Double if (t < 50)  => "Cold"
        case _                      => "Temperate"
    }
    val humOut = hum match {
        case h: Double if (h > 40 && tempOut != "Cold") => "Humid"
        case h: Double if (h > 40 && tempOut == "Cold") => "Damp"
        case _                                          => "Pleasant"

    }
    (tempOut, humOut)
}

weather(20, 55) is ("Cold", "Damp")
weather(20, 39) is ("Cold", "Pleasant")
weather(81, 45) is ("Hot", "Humid")
weather(50, 45) is ("Temperate", "Humid")