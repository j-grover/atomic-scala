// Solution-5.scala

// 5. Create a case class named Activity that contains a String for the
// date (like “01-30”) and a String for the activity you did that day (like
// “Bike,” “Run,” “Ski”). Store your activities in a Vector. Create a
// method getDates that returns a Vector of String corresponding to
// the days that you did the specified activity. Satisfy the following
// tests:
// val activities = Vector(
// Activity("01-01", "Run"), 
// Activity("01-03", "Ski"),
// Activity("01-04", "Run"),
// Activity("01-10", "Ski"),
// Activity("01-03", "Run"))
// getDates("Ski", activities) is
//  Vector("01-03", "01-10")
// getDates("Run", activities) is
//  Vector("01-01", "01-04", "01-03")
// getDates("Bike", activities) is Vector()

import com.atomicscala.AtomicTest._

case class Activity(date: String, activity: String)

def getDates(
    activity: String, 
    activities: Vector[Activity]
): Vector[String] = {
    for {
        a <- activities
        if (a.activity == activity)
    } yield a.date
}

val activities = Vector(
    Activity("01-01", "Run"), 
    Activity("01-03", "Ski"),
    Activity("01-04", "Run"),
    Activity("01-10", "Ski"),
    Activity("01-03", "Run")
)

getDates("Ski", activities) is Vector("01-03", "01-10")
getDates("Run", activities) is Vector("01-01", "01-04", "01-03")
getDates("Bike", activities) is Vector()