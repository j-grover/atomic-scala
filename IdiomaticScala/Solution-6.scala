// Solution-6.scala

// 6. Refactor Dog.scala, Cat.scala and Hamster.scala from Methods
// Inside Classes. 

import com.atomicscala.AtomicTest._

// Dog.scala

class Dog {
    def bark = "yip!"
}

// Cat.scala

class Cat {
    def meow = "mew!"
}

val cat = new Cat
val m1 = cat.meow
assert("mew!" == m1, "Expected mew!, Got " + m1)

// Hamster.scala

class Hamster {
  def speak = "squeak!"
  def exercise = speak + " Running on wheel"
}

val hamster = new Hamster
val e1 = hamster.exercise
assert(
    "squeak! Running on wheel" == e1,
    "Expected squeak! Running on wheel" +
    ", Got " + e1
)