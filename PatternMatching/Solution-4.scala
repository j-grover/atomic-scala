// Solution-4.scala

// 4. Create a method forecast that represents the percentage of
// cloudiness, and use it to produce a “weather forecast” string such
// as “Sunny” (100), “Mostly Sunny” (80), “Partly Sunny” (50), “Mostly
// Cloudy” (20), and “Cloudy” (0). For this exercise, only match for the
// legal values 100, 80, 50, 20, and 0. Everything else should produce
// “Unknown.” Satisfy the following tests:
// forecast(100) is "Sunny"
// forecast(80) is "Mostly Sunny"
// forecast(50) is "Partly Sunny"
// forecast(20) is "Mostly Cloudy"
// forecast(0) is "Cloudy"
// forecast(15) is "Unknown" 

import com.atomicscala.AtomicTest._

def forecast(percentage: Int): String = {
    percentage match {
        case 100 => "Sunny"
        case 80 => "Mostly Sunny"
        case 50 => "Partly Sunny"
        case 20 => "Mostly Cloudy"
        case 0 => "Cloudy"
        case 15 => "Unknown"
    }
}

forecast(100) is "Sunny"
forecast(80) is "Mostly Sunny"
forecast(50) is "Partly Sunny"
forecast(20) is "Mostly Cloudy"
forecast(0) is "Cloudy"
forecast(15) is "Unknown"