// Solution-5.scala

// 5. Create a class Seed with subclasses Tomato, Corn and Zucchini.
// Override toString in each subclass to indicate the type of plant.
// Create a class Garden which takes as its constructor argument any
// number of Seeds. Store the Seeds in a Vector inside Garden.
// Override Garden’s toString to produce the string representation of
// this Vector, formatted with the mkString method. Satisfy the
// following test:
// val garden = new Garden(
// new Tomato, new Corn, new Zucchini)
// garden is "Tomato, Corn, Zucchini"
  
import com.atomicscala.AtomicTest._

class Seed

class Tomato extends Seed {
    override def toString = "Tomato"
}

class Corn extends Seed {
    override def toString = "Corn"
}

class Zucchini extends Seed {
    override def toString = "Zucchini"
}

class Garden(seeds: Seed*) {
    val seedsVector = seeds.toVector 
    override def toString = seedsVector.mkString(", ")
}

val garden = new Garden(new Tomato, new Corn, new Zucchini)
garden is "Tomato, Corn, Zucchini"