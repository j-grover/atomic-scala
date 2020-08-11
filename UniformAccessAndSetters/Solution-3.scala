// Solution-3.scala

// 3. Create a class with a var named internal and a getter and setter for
// internal named x, and demonstrate that it works. 

import com.atomicscala.AtomicTest._

class GetSet {
    var internal = 0
    def x = internal
    def x_= (value: Int) = internal = value
}

val getSet = new GetSet
getSet.x is 0
getSet.x = 20
getSet.x is 20