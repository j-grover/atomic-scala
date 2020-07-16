// Solution-1.scala

// 1. Create a new class Family that takes a variable argument list
// representing the names of family members. Satisfy the following
// tests:
// val family1 = new Family("Mom",
//  "Dad", "Sally", "Dick")
// family1.familySize() is 4
// val family2 = new Family("Dad", "Mom", "Harry")
// family2.familySize() is 3
 
import com.atomicscala.AtomicTest._

class Family(names: String*) {
    def familySize(): Int = {
        var size = 0
        for (n <- names) size += 1
        size
    }
}

val family1 = new Family("Mom", "Dad", "Sally", "Dick")
family1.familySize() is 4
val family2 = new Family("Dad", "Mom", "Harry")
family2.familySize() is 3