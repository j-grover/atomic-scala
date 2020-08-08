// Solution-2.scala

// 2. Rework your solution for Exercise 2 in Base Class Initialization by
// defining myWords in the base class and overriding it in the
// derived class. Satisfy the following tests:
// val roaringApe = 
//  new GreatApe2(112, 9, "Male")
// roaringApe.myWords is Vector("Roar")
// val chattyBonobo =
//  new Bonobo2(150, 14, "Female")
// chattyBonobo.myWords is
// Vector("Roar","Hello")

import com.atomicscala.AtomicTest._

class GreatApe2(val weight: Double, val age: Int, val gender: String) {
    var myWords = Vector("Roar")
}

class Bonobo2(weight: Double, age: Int, gender: String)
extends GreatApe2(weight, age, gender) {
    myWords = Vector("Roar", "Hello")
}

val roaringApe = new GreatApe2(112, 9, "Male")
roaringApe.myWords is Vector("Roar")

val chattyBonobo = new Bonobo2(150, 14, "Female")
chattyBonobo.myWords is Vector("Roar","Hello")