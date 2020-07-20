// Solution-1.scala

// 1. Create a class called ClothesWasher with a default constructor and
// two auxiliary constructors, one that specifies model (as a String)
// and one that specifies capacity (as a Double). 
 
import com.atomicscala.AtomicTest._

class ClothesWasher(val model: String, val capacity: Double) {
  def this(model: String) = {
    this(model, 100)
  }

  def this(capacity: Double) = {
    this("Samsung", capacity)
  }
}

val washer = new ClothesWasher("LG", 200)
washer.model is "LG"
washer.capacity is 200

val washer2 = new ClothesWasher("LG")
washer2.model is "LG"
washer2.capacity is 100


val washer3 = new ClothesWasher(500)
washer3.model is "Samsung"
washer3.capacity is 500