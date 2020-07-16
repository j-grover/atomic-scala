// Solution-2.scala

// 2. Adapt the Family class definition to include class arguments for a
// mother, father, and a variable number of children. What changes
// did you have to make? Satisfy the following tests:
// val family3 = new FlexibleFamily(
//  "Mom", "Dad", "Sally", "Dick")
// family3.familySize() is 4
// val family4 =
//  new FlexibleFamily("Dad", "Mom", "Harry")
// family4.familySize() is 3

import com.atomicscala.AtomicTest._

class FlexibleFamily(mother: String, father: String, children: String*) {
    def familySize(): Int = {
        var size = 0
        for (n <- children) size += 1
        size + 2
    }
}

val family3 = new FlexibleFamily("Mom", "Dad", "Sally", "Dick")
family3.familySize() is 4
val family4 = new FlexibleFamily("Dad", "Mom", "Harry")
family4.familySize() is 3