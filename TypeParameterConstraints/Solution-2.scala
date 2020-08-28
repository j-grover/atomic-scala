// Solution-2.scala

// 2. Modify Constraint.scala so CallF is a method rather than a class. 

import com.atomicscala.AtomicTest._

class WithF {
    def f(n: Int) = n * 11
}

def callF[T <: WithF](t: T, n: Int) = t.f(n)

callF(new WithF, 2) is 22

callF(new WithF {
    override def f(n: Int) = n * 7
}, 2) is 14