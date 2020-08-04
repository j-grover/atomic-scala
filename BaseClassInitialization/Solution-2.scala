// Solution-2.scala

// 2. Demonstrate that the Bonobo constructor can call methods in the
// GreatApe class by adding a method to GreatApe and calling it from
// the Bonobo constructor. 

import com.atomicscala.AtomicTest._

class GreatApe(val weight: Double, val age: Int, val height: Double) {
    def getAge = println(age)
}

class Bonobo(weight: Double, age: Int, height: Double)
    extends GreatApe(weight, age, height) {
        getAge
    }

new Bonobo(100, 12, 50)

/* Results in:
12
*/