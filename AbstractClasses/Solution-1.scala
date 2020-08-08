// Solution-1.scala

// 1. Modify Animal and its subclasses to also indicate what each
// animal eats. Satisfy the following tests:
// val duck = new Duck
// duck.food is "plants"
// val cow = new Cow
// cow.food is "grass"
 
import com.atomicscala.AtomicTest._

abstract class Animal {
    def templateMethod = s"The $animal goes $sound"
    def animal: String
    def sound: String
    def food: String
}

class Duck extends Animal {
    def animal = "Duck"
    override def sound = "Quack"
    def food = "plants"
} 

class Cow extends Animal {
    def animal = "Cow"
    def sound = "Moo"
    def food = "grass"
} 

val duck = new Duck
duck.food is "plants"

val cow = new Cow
cow.food is "grass"