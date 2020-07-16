// Solution-5.scala

// 5. Create a Vector named sunnyData that holds the values (100, 80,
// 50, 20, 0, 15). Use a for loop to call forecast with the contents of
// sunnyData. Display the answers and ensure that they match the
// responses above. 

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

val sunnyData = Vector(100, 80, 50, 20, 0, 15)
for (p <- sunnyData) println(forecast(p))

/* Results in:
Sunny
Mostly Sunny
Partly Sunny
Mostly Cloudy
Cloudy
Unknown
*/