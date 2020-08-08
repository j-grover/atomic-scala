// Solution-5.scala

// 5. Inherit a class from Animal and try making an animal method that
// takes an argument. 

import com.atomicscala.AtomicTest._

abstract class Animal {
    def templateMethod = s"The $animal goes $sound"
    def animal: String
    def sound: String
    def food: String
}

case class Duck(name: String) extends Animal {
    def animal = "Duck"
    def sound = "Quack"
    def food = "plants"
    def getName = name
} 

Duck("Quack Duck").getName is "Quack Duck"