// Solution-4.scala

// 4. In Pattern Matching, we created a method for weather forecasts
// using “Sunny” (100), “Mostly Sunny” (80), “Partly Sunny” (50),
// “Mostly Cloudy” (20), and “Cloudy” (0). Using parameterized types,
// create a method historicalData that counts the number of sunny,
// partly sunny, etc. days. Satisfy the following tests:
// val weather = Vector(100, 80, 20, 100, 20)
// historicalData(weather) is
// "Sunny=2, Mostly Sunny=1, Mostly Cloudy=2"

import com.atomicscala.AtomicTest._

def historicalData(weather: Vector[Int]): String = {
    var sunny = 0
    var mostlySunny = 0
    var mostlyCloudy = 0

    def forecast(percentage: Int): Unit = {
        percentage match {
            case 100 => sunny += 1
            case 80 => mostlySunny += 1
            case 20 => mostlyCloudy += 1
        }
    }

    for (p <- weather) {
        forecast(p) 
    }

    s"Sunny=$sunny, Mostly Sunny=$mostlySunny, Mostly Cloudy=$mostlyCloudy"
}

val weather = Vector(100, 80, 20, 100, 20)
historicalData(weather) is "Sunny=2, Mostly Sunny=1, Mostly Cloudy=2"