// Solution-2.scala

// 2. Add explicit return types to the previous exercise.   

import com.atomicscala.AtomicTest._

def f(i: Int): Option[Int] =
    if (i == 0)
        None
    else
        Some(24 / i)

f(4) is Some(6)
f(5) is Some(4)
f(6) is Some(4)
f(0) is None
f(24) is Some(1)
f(25) is Some(0)