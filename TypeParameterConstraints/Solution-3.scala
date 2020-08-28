// Solution-3.scala

// 3. Create a three-level inheritance hierarchy Base, Derived and Most.
// Create three methods f1, f2 and f3 that each take a single object
// argument, constrained to a different class in the hierarchy. Try
// passing all different objects to all different methods. 

import com.atomicscala.AtomicTest._

class Base {
    override def toString = "Base"
}

class Derived extends Base {
    override def toString = "Derived"
}

class Most extends Derived {
    override def toString = "Most"
}

def f1[T <: Base](t: T) = t

def f2[T <: Derived](t: T) = t

def f3[T <: Most](t: T) = t

f1(new Base) is "Base"
f1(new Derived) is "Derived"
f1(new Most) is "Most"

// f2(new Base) is "Base"
f2(new Derived) is "Derived"
f2(new Most) is "Most"

// f3(new Base) is "Base"
// f3(new Derived) is "Derived"
f3(new Most) is "Most"

// Commented out method calls do not follow type constraints