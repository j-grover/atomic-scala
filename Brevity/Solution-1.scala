// Solution-1.scala

// 1. Refactor the following example. First, remove the intermediate
// result and satisfy the tests:
// def assignResult(arg:Boolean):Int = {
//  val result = if(arg) 42 else 47
//  result
// }
// assignResult(true) is 42
// assignResult(false) is 47

import com.atomicscala.AtomicTest._

def assignResult(arg: Boolean): Int = {
    if(arg) 42 else 47
}

assignResult(true) is 42
assignResult(false) is 47