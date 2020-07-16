// Solution-3.scala

// 3. Rewrite checkTruth from More Conditionals with pattern
// matching. Satisfy the following tests:
// checkTruth(true || false, true) is
//  "Both are true"
// checkTruth(1 > 0 && -1 < 0, 1 == 2) is
//  "First: true, second: false"
// checkTruth(1 >= 2, 1 >= 1) is
//  "First: false, second: true"
// checkTruth(true && false, false && true) is
//  "Both are false"

import com.atomicscala.AtomicTest._

def checkTruth(exp1: Boolean, exp2: Boolean): String = {
    exp1 match {
        case true => {
            exp2 match {
                case true => "Both are true"
                case _ => "First: true, second: false"
            }
        }
        case false => {
            exp2 match {
                case true => "First: false, second: true"
                case _ => "Both are false"
            }
        }
    }
}

checkTruth(true || false, true) is "Both are true"
checkTruth(1 > 0 && -1 < 0, 1 == 2) is "First: true, second: false"
checkTruth(1 >= 2, 1 >= 1) is "First: false, second: true"
checkTruth(true && false, false && true) is "Both are false"