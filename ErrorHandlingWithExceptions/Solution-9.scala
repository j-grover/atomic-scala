// Solution-9.scala

// 9. Create a three-level inheritance hierarchy of exceptions. Now
// create a base class A with a method f that throws the exception at
// the base of your hierarchy. Inherit B from A and override f so it
// throws the exception at level two of your hierarchy. Repeat by
// inheriting class C from B. Create a C and assign it to an A (this is
// called “upcasting”), then call f.  

import com.atomicscala.AtomicTest._

class E1 extends Exception
class E2 extends E1
class E3 extends E2

class A {
    def f = throw new E1
}

class B extends A {
    override def f = throw new E2
}

class C extends B {
    override def f = throw new E3
}

val result = try {
    val a: A = new C
    a.f
} catch {
    case e: Exception => e.getClass().getSimpleName()
}

result is "E3"