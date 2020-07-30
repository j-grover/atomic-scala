// Solution-5.scala

// 5. Pattern Matching included an exercise to check the forecast, based
// on sunniness. We tested using discrete values. Revisit that
// exercise with ranges of values. Create a method forecast that
// represents the percentage of cloudiness, and use it to produce a
// “weather forecast” string such as “Sunny” (100), “Mostly Sunny”
// (80), “Partly Sunny” (50), “Mostly Cloudy” (20), and “Cloudy” (0).
// Satisfy the following tests:
// forecast(100) is "Sunny"
// forecast(81) is "Sunny"
// forecast(80) is "Mostly Sunny"
// forecast(51) is "Mostly Sunny"
// forecast(50) is "Partly Sunny"
// forecast(21) is "Partly Sunny" 
// forecast(20) is "Mostly Cloudy"
// forecast(1) is "Mostly Cloudy"
// forecast(0) is "Cloudy"
// forecast(-1) is "Unknown"

import com.atomicscala.AtomicTest._

def forecast(p: Int): String = {
    p match {
        case _ if p > 80    => "Sunny"
        case _ if p > 50    => "Mostly Sunny"
        case _ if p > 20    => "Partly Sunny"
        case _ if p > 0     => "Mostly Cloudy"
        case 0              => "Cloudy"
        case _              => "Unknown"
    }
}

forecast(100) is "Sunny"
forecast(81) is "Sunny"
forecast(80) is "Mostly Sunny"
forecast(51) is "Mostly Sunny"
forecast(50) is "Partly Sunny"
forecast(21) is "Partly Sunny" 
forecast(20) is "Mostly Cloudy"
forecast(1) is "Mostly Cloudy"
forecast(0) is "Cloudy"
forecast(-1) is "Unknown"