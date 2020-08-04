// Solution-1.scala

// 1. Add a method vocalize to GreatApe. Satisfy the following tests:
// val ape1 = new GreatApe
// ape1.vocalize is "Grrr!"
// val ape2 = new Bonobo
// ape2.vocalize is "Grrr!"
// val ape3 = new Chimpanzee
// ape3.vocalize is "Grrr!"

import com.atomicscala.AtomicTest._

class GreatApe {
    val weight = 100.0
    val age = 12

    def vocalize = "Grrr!"
} 

class Bonobo extends GreatApe
class Chimpanzee extends GreatApe
class BonoboB extends Bonobo 

val ape1 = new GreatApe
ape1.vocalize is "Grrr!"

val ape2 = new Bonobo
ape2.vocalize is "Grrr!"

val ape3 = new Chimpanzee
ape3.vocalize is "Grrr!"