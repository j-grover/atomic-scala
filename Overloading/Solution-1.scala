// Solution-1.scala

// 1. Modify Overloading.scala so the argument lists for all the methods
// are identical. Observe the error messages. 
 
import com.atomicscala.AtomicTest._

class Overloading1 {
  def f(n:Int):Int = { n + 88 }
  def f(n:Int):Int = { n + 2 }
}

class Overloading2 {
  def f(n:Int):Int = { n + 99 }
  def f(n:Int):Int = { n + 3 }
}

val mo1 = new Overloading1
val mo2 = new Overloading2
mo1.f(0) is 88
mo1.f(11) is 13
mo2.f(0) is 99
mo2.f(11) is 14

/* Results in:
./Overloading/Solution-1.scala
.\Overloading\Solution-1.scala:10: error: method f is defined twice;
  the conflicting method f was defined at line 9:7
  def f(n:Int):Int = { n + 2 }
      ^
.\Overloading\Solution-1.scala:15: error: method f is defined twice;
  the conflicting method f was defined at line 14:7
  def f(n:Int):Int = { n + 3 }
*/