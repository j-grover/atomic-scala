// Solution-2.scala

// 2. Add new classes for Chicken and Pig. Satisfy the following tests:
// val chicken = new Chicken
// chicken.food is "insects"
// val pig = new Pig
// pig.food is "anything"

import com.atomicscala.AtomicTest._

abstract class Animal {
    def templateMethod = s"The $animal goes $sound"
    def animal: String
    def sound: String
    def food: String
}

class Duck extends Animal {
    def animal = "Duck"
    def sound = "Quack"
    def food = "plants"
} 

class Cow extends Animal {
    def animal = "Cow"
    def sound = "Moo"
    def food = "grass"
} 

class Chicken extends Animal {
    def animal = "Chicken"
    def sound = ""
    def food = "insects"
}

class Pig extends Animal {
    def animal = "Pig"
    def sound = ""
    def food = "anything"
}

val chicken = new Chicken
chicken.food is "insects"

val pig = new Pig
pig.food is "anything"