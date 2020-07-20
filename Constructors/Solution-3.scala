// Solution-3.scala

// 3. Use your solution for Exercise 2 as a starting point. Make decaf,
// milk, sugar and name accessible outside of the class. Satisfy the
// following tests:
// val tea = new Tea2
// tea.describe is "Earl Grey"
// tea.calories is 0
// tea.name is "Earl Grey"
// val lemonZinger = new Tea2(decaf = true,
//  name="Lemon Zinger")
// lemonZinger.describe is
//  "Lemon Zinger decaf"
// lemonZinger.calories is 0
// lemonZinger.decaf is true
// val sweetGreen = new Tea2(
//  name="Jasmine Green", sugar=true)
// sweetGreen.describe is
//  "Jasmine Green + sugar"
// sweetGreen.calories is 16
// sweetGreen.sugar is true
// val teaLatte = new Tea2(sugar=true,
//  milk=true)
// teaLatte.describe is
//  "Earl Grey + milk + sugar"
// teaLatte.calories is 116
// teaLatte.milk is true

import com.atomicscala.AtomicTest._

class Tea2(
    val name: String = "Earl Grey",
    val decaf: Boolean = false,
    val sugar: Boolean = false,
    val milk: Boolean = false
) {
    def describe(): String = {
        var description = name
        if (decaf) description += " decaf"
        if (milk) description += " + milk"
        if (sugar) description += " + sugar"
        description
    }
    def calories(): Int = {
        var cal = 0
        if (sugar) cal += 16
        if (milk) cal += 100
        cal
    }

}

val tea = new Tea2
tea.describe is "Earl Grey"
tea.calories is 0
tea.name is "Earl Grey"

val lemonZinger = new Tea2(decaf = true, name="Lemon Zinger")
lemonZinger.describe is "Lemon Zinger decaf"
lemonZinger.calories is 0
lemonZinger.decaf is true

val sweetGreen = new Tea2(name="Jasmine Green", sugar=true)
sweetGreen.describe is "Jasmine Green + sugar"
sweetGreen.calories is 16
sweetGreen.sugar is true

val teaLatte = new Tea2(sugar=true, milk=true)
teaLatte.describe is "Earl Grey + milk + sugar"
teaLatte.calories is 116
teaLatte.milk is true