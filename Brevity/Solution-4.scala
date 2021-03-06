// Solution-4.scala

// 4. Refactor Coffee.scala from Constructors using the techniques in
// this atom. 

import com.atomicscala.AtomicTest._

class Coffee(
    val shots: Int = 2,
    val decaf: Boolean = false,
    val milk: Boolean = false,
    val toGo: Boolean = false,
    val syrup: String = ""
) {
    var result = ""
    println(shots, decaf, milk, toGo, syrup)

    def getCup() =
        if(toGo)
            result += "ToGoCup "
        else
            result += "HereCup "
    
    def pourShots() {
        for (s <- 0 until shots)
            if (decaf)
                result += "decaf shot "
            else
                result += "shot "
    }

    def addMilk() {
        if(milk)
            result += "milk "
    }

    def addSyrup() {
        result += syrup
    }

    getCup()
    pourShots()
    addMilk()
    addSyrup()
}

val usual = new Coffee
usual.result is "HereCup shot shot "
val mocha = new Coffee(decaf = true, toGo = true, syrup = "Chocolate")
mocha.result is "ToGoCup decaf shot decaf shot Chocolate"
