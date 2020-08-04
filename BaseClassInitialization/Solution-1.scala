// Solution-1.scala

// 1. In GreatApe2.scala, add another val field in GreatApe. Now add a
// new subclass BonoboC that inherits from BonoboB. Write a test for
// BonoboC. 
 
import com.atomicscala.AtomicTest._

class GreatApe(val weight: Double, val age: Int, val height: Double)

class Bonobo(weight: Double, age: Int, height: Double)
    extends GreatApe(weight, age, height)

class Chimpanzee(weight: Double, age: Int, height: Double)
    extends GreatApe(weight, age, height)

class BonoboB(weight: Double, age: Int, height: Double)
    extends Bonobo(weight, age, height)

class BonoboC(weight: Double, age: Int, height: Double)
    extends BonoboB(weight, age, height)

def display(ape: GreatApe) =
    s"weight: ${ape.weight} age: ${ape.age} height: ${ape.height}"

display(new GreatApe(100, 12, 50)) is "weight: 100.0 age: 12 height: 50.0"
display(new Bonobo(100, 12, 50)) is "weight: 100.0 age: 12 height: 50.0"
display(new Chimpanzee(100, 12, 50)) is "weight: 100.0 age: 12 height: 50.0"
display(new BonoboB(100, 12, 50)) is "weight: 100.0 age: 12 height: 50.0"
display(new BonoboC(100, 12, 50)) is "weight: 100.0 age: 12 height: 50.0"