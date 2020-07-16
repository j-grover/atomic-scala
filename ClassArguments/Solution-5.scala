// Solution-5.scala

// 5. Can you put the variable argument list first, and the parents last?  

import com.atomicscala.AtomicTest._

class FlexibleFamily(children: String*, mother: String, father: String) {
    def familySize(): Int = {
        var size = 0
        for (n <- children) size += 1
        size + 2
    }
}

/* Results in:
.\ClassArguments\Solution-5.scala:7: error: *-parameter must come last        
class FlexibleFamily(children: String*, mother: String, father: String) {     
                     ^

Cannot put the variable argument list first
*/