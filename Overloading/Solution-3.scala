// Solution-3.scala

// 3. Modify Exercise 2 to define the methods inside of a class. 

import com.atomicscala.AtomicTest._

class Addition {
    def f(): Int = 0
    def f(a: Int): Int = a
    def f(a: Int, b: Int): Int = a + b
    def f(a: Int, b: Int, c: Int): Int = a + b + c
    def f(a: Int, b: Int, c: Int, d: Int): Int = a + b + c + d
}

val add = new Addition

add.f() is 0
add.f(1) is 1
add.f(1, 2) is 3
add.f(1, 2, 3) is 6
add.f(1, 2, 3, 4) is 10