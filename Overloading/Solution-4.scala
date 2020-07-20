// Solution-4.scala

// 4. Modify your solution for Exercise 3 to add a method with the same
// name and arguments, but a different return type. Does that work?
// Does it matter if you use an explicit return type or type inference
// for the return type? 

import com.atomicscala.AtomicTest._

class Addition {
    def f(): Int = 0
    def f(a: Int): Int = a
    def f(a: Int, b: Int): Int = a + b
    def f(a: Int, b: Int, c: Int): Int = a + b + c
    def f(a: Int, b: Int, c: Int, d: Int): Int = a + b + c + d
    
    def f(a: Int): String = "a"
}

val add = new Addition

add.f() is 0
add.f(1) is 1
add.f(1, 2) is 3
add.f(1, 2, 3) is 6
add.f(1, 2, 3, 4) is 10

// Different return type does not work with same name and arguments