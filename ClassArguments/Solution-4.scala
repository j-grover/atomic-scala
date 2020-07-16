// Solution-4.scala

// 4. Can you use a variable argument list for both parents and
// children?

import com.atomicscala.AtomicTest._

class FlexibleFamily(parents: String*, children: String*) {
    def familySize(): Int = {
        var size = 0
        for (n <- parents) size += 1
        for (n <- children) size += 1
        size
    }
}

/* Results in:
.\ClassArguments\Solution-4.scala:8: error: *-parameter must come last        
class FlexibleFamily(parents: String*, children: String*) {

Cannot use variable arguments for both
*/
