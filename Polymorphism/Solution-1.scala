// Solution-1.scala

// 1. Write code that verifies the animals/vehicles description in the
// second paragraph of this atom. 
 
import com.atomicscala.AtomicTest._

trait Mobile {
    def move = "mobile moving"
}

class Animal extends Mobile {
    override def move = "animal moving"
}

class Vehicle extends Mobile {
    override def move = "vehicle moving"
}

def move(mobile: Mobile) = mobile.move

val dog = new Animal
val car = new Vehicle

move(dog) is "animal moving"
move(car) is "vehicle moving"