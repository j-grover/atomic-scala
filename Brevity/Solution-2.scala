// Solution-2.scala

// 2. Continue the previous exercise by removing unnecessary curly
// braces. Satisfy the following tests:
// assignResult2(true) is 42
// assignResult2(false) is 47

import com.atomicscala.AtomicTest._

def assignResult2(arg: Boolean): Int =
    if(arg) 42 else 47

assignResult2(true) is 42
assignResult2(false) is 47