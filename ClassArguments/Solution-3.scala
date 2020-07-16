// Solution-3.scala

// 3. Does it work to leave out the kids altogether? Should you modify
// your familySize method? Satisfy the following test:
// val familyNoKids =
//  new FlexibleFamily("Mom", "Dad")
// familyNoKids.familySize() is 2 

import com.atomicscala.AtomicTest._

class FlexibleFamily(mother: String, father: String, children: String*) {
    def familySize(): Int = {
        var size = 0
        for (n <- children) size += 1
        size + 2
    }
}

val familyNoKids = new FlexibleFamily("Mom", "Dad")
familyNoKids.familySize() is 2

// Works when there are no kids