// Solution-2.scala

// 2. Create a new class Tea that has 2 methods: describe, which
// includes information about whether the tea includes milk, sugar,
// is decaffeinated, and includes the name; and calories, which adds
// 100 calories for milk and 16 calories for sugar. Satisfy the following
// tests:
// val tea = new Tea
// tea.describe is "Earl Grey"
// tea.calories is 0
// val lemonZinger = new Tea(
//  decaf = true, name="Lemon Zinger")
// lemonZinger.describe is
//  "Lemon Zinger decaf"
// lemonZinger.calories is 0
// val sweetGreen = new Tea(
//  name="Jasmine Green", sugar=true)
// sweetGreen.describe is
//  "Jasmine Green + sugar"
// sweetGreen.calories is 16
// val teaLatte = new Tea(
//  sugar=true, milk=true)
// teaLatte.describe is
//  "Earl Grey + milk + sugar"
//  teaLatte.calories is 116

import com.atomicscala.AtomicTest._

class Tea(
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

val tea = new Tea
tea.describe is "Earl Grey"
tea.calories is 0

val lemonZinger = new Tea(decaf = true, name="Lemon Zinger")
lemonZinger.describe is "Lemon Zinger decaf"
lemonZinger.calories is 0

val sweetGreen = new Tea(name="Jasmine Green", sugar=true)
sweetGreen.describe is "Jasmine Green + sugar"
sweetGreen.calories is 16

val teaLatte = new Tea(sugar=true, milk=true)
teaLatte.describe is "Earl Grey + milk + sugar"
teaLatte.calories is 116