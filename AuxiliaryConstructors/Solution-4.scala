// Solution-4.scala

// 4. Recall from Overloading that methods can be overloaded in Scala,
// and that this is different from the way that we overload
// constructors (writing auxiliary constructors). Add two methods to
// your solution for Exercise 1 to show that methods can be
// overloaded. Satisfy the following tests:
// val washer =
//  new ClothesWasher3("LG 100", 3.6)
// washer.wash(2, 1) is
// "Wash used 2 bleach and 1 fabric softener"
// washer.wash() is "Simple wash"

import com.atomicscala.AtomicTest._

class ClothesWasher3(val model: String, val capacity: Double) {
  def this(model: String) = {
    this(model, 100)
  }

  def this(capacity: Double) = {
    this("Samsung", capacity)
  }

  def wash(bleach: Int, fabric: Int): String = {
      "Wash used " + bleach + " bleach and " + fabric + " fabric softener"
  }

  def wash(): String = "Simple wash"
}

val washer = new ClothesWasher3("LG 100", 3.6)
washer.wash(2, 1) is "Wash used 2 bleach and 1 fabric softener"
washer.wash() is "Simple wash"