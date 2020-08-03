// Solution-4.scala

// 4. Using your solution for the previous exercise, unpack the values
// into heat and moisture. Satisfy the following tests:
// val (/* fill this in */) = weather(81, 45)
// heat1 is "Hot"
// moisture1 is "Humid"
// val (/* fill this in */) = weather(27, 55)
// heat2 is "Cold"
// moisture2 is "Damp" 

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

val (heat1, moisture1) = weather(81, 45)
heat1 is "Hot"
moisture1 is "Humid"

val (heat2, moisture2) = weather(27, 55)
heat2 is "Cold"
moisture2 is "Damp" 