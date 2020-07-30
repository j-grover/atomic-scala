// Solution-6.scala

// 6. Building on the previous exercise, create a method getActivities
// that flips things around by returning a Vector of Strings
// corresponding to the names of the activities that you did on the
// specified day. Satisfy the following tests:
// getActivities("01-01", activities) is
//  Vector("Run")
// getActivities("01-02", activities) is
//  Vector()
// getActivities("01-03", activities) is
//  Vector("Ski", "Run")
// getActivities("01-04", activities) is
//  Vector("Run")
// getActivities("01-10", activities) is
//  Vector("Ski")

import com.atomicscala.AtomicTest._

case class Activity(date: String, activity: String)

def getActivities(
    date: String, 
    activities: Vector[Activity]
): Vector[String] = {
    for {
        a <- activities
        if (a.date == date)
    } yield a.activity
}

val activities = Vector(
    Activity("01-01", "Run"), 
    Activity("01-03", "Ski"),
    Activity("01-04", "Run"),
    Activity("01-10", "Ski"),
    Activity("01-03", "Run")
)

getActivities("01-01", activities) is Vector("Run")
getActivities("01-02", activities) is Vector()
getActivities("01-03", activities) is Vector("Ski", "Run")
getActivities("01-04", activities) is Vector("Run")
getActivities("01-10", activities) is Vector("Ski")