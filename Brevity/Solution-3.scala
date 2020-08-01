// Solution-3.scala

// 3. Continue the previous exercise by removing the return type of the
// method. Note that you had to keep the equals sign. Do you see a
// downside if you don’t declare the return type? Satisfy the
// following tests:
// assignResult3(true) is 42
// assignResult3(false) is 47

import com.atomicscala.AtomicTest._

def assignResult3(arg: Boolean) =
    if(arg) 42 else 47

assignResult3(true) is 42
assignResult3(false) is 47

// Downside is you can't tell by looking at the signature what 
// the method will return