// Solution-1.scala

// 1. Create a var reference to an immutable Map and demonstrate
// what this means (prove you can’t change its contents, nor append
// to it. Show that you can rebind the reference). Now create a val
// reference to a mutable Map and demonstrate what this means. 
 
import com.atomicscala.AtomicTest._
import collection.mutable.{Map => MutMap}

var r = Map("c" -> 22)

var m = Map("a" -> 9)
// m("a") = 10 // Fails
m + ("b" -> 10)
m.keys is Set("a")
m = r
m.keys is Set("c")

val m2 = MutMap("a" -> 9)
m2("a") = 10
m2("a") is 10
m2 += ("b" -> 20)
m2.keys is Set("a", "b")
// m2 = r // Fails