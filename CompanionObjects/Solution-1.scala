// Solution-1.scala

// 1. Create a class WalkActivity that takes no class arguments. Create a
// companion object with a single method start that has a single
// argument for a name and prints “started!” Demonstrate how to
// call this method. Did you have to instantiate the WalkActivity
// object?

import com.atomicscala.AtomicTest._

class WalkActivity

object WalkActivity {
    def start(name: String) = println("started!")
}

WalkActivity.start("test")

// WalkActivity object did not have to be instantiated