// Solution-2.scala

// 2. Building on your solution for the previous exercise, add a field to
// the companion object to log activities (Hint: Use a var String).
// Calling start("Sally") should append “[Sally] Activity started.” Also,
// add a stop method that similarly appends “[Sally] Activity
// stopped.”

import com.atomicscala.AtomicTest._

class WalkActivity

object WalkActivity {
    var log = ""

    def start(name: String): Unit =
        log += s"[$name] Activity started.\n"
    
    def stop(name: String): Unit =
        log += s"[$name] Activity stopped.\n"
}

WalkActivity.start("Sally")
WalkActivity.stop("Sally")
WalkActivity.log is "[Sally] Activity started.\n[Sally] Activity stopped.\n"