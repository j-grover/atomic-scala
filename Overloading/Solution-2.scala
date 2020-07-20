// Solution-2.scala

// 2. Create five overloaded methods that sum their arguments. Create
// the first with no arguments, the second with one argument, etc.
// Satisfy the following tests:
// f() is 0
// f(1) is 1
// f(1, 2) is 3
// f(1, 2, 3) is 6
// f(1, 2, 3, 4) is 10

import com.atomicscala.AtomicTest._

def f(): Int = 0
def f(a: Int): Int = a
def f(a: Int, b: Int): Int = a + b
def f(a: Int, b: Int, c: Int): Int = a + b + c
def f(a: Int, b: Int, c: Int, d: Int): Int = a + b + c + d

f() is 0
f(1) is 1
f(1, 2) is 3
f(1, 2, 3) is 6
f(1, 2, 3, 4) is 10