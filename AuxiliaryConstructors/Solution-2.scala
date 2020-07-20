// Solution-2.scala

// 2. Create a class ClothesWasher2 that looks just like your solution for
// Exercise 1, but use named and default arguments instead so you
// produce the same results with just a default constructor. 

import com.atomicscala.AtomicTest._

class ClothesWasher2(val model: String = "LG", val capacity: Double = 200) {
  def this(model: String) = {
    this(model, 100)
  }

  def this(capacity: Double) = {
    this("Samsung", capacity)
  }
}

val washer = new ClothesWasher2
washer.model is "LG"
washer.capacity is 200

val washer2 = new ClothesWasher2("LG")
washer2.model is "LG"
washer2.capacity is 100


val washer3 = new ClothesWasher2(500)
washer3.model is "Samsung"
washer3.capacity is 500