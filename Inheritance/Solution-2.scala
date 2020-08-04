// Solution-2.scala

// 2. Building on the previous exercise, create a method says that takes
// a GreatApe argument and calls vocalize. Satisfy the following tests:
// says(new GreatApe) is "says Grrr!"
// says(new Bonobo) is "says Grrr!"
// says(new Chimpanzee) is "says Grrr!"
// says(new BonoboB) is "says Grrr!"

import com.atomicscala.AtomicTest._

class GreatApe {
    val weight = 100.0
    val age = 12

    def vocalize = "Grrr!"
} 

class Bonobo extends GreatApe
class Chimpanzee extends GreatApe
class BonoboB extends Bonobo 

def says(ape: GreatApe) = "says Grrr!"

says(new GreatApe) is "says Grrr!"
says(new Bonobo) is "says Grrr!"
says(new Chimpanzee) is "says Grrr!"
says(new BonoboB) is "says Grrr!"