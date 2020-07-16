// Solution-5.scala

// 5. Can you modify your solution for Exercise 2 in Class Arguments to
// default the mother’s name to “Mom” and the father’s name to
// “Dad?” Why do you get an error? Hint: Scala does a good job of
// telling you what the problem is. 

import com.atomicscala.AtomicTest._

class FlexibleFamily(mother: String = "Mom", father: String = "Dad?", children: String*) {
    def familySize(): Int = {
        var size = 0
        for (n <- children) size += 1
        size + 2
    }
}

/* Results in:
.\NamedAndDefaultArguments\Solution-5.scala:10: error: a parameter section with a `*`-parameter is not allowed to have default arguments
class FlexibleFamily(mother: String = "Mom", father: String = "Dad?", children: String*) {
                    ^
*/