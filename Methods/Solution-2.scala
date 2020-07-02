// Solution-2.scala

// 2. Create a method getSquareDouble that takes a Double argument
// and returns its square. Print your answer. How does this differ
// from Exercise 1? Use the following code to check your solutions.
// val sd1 = getSquareDouble(1.2)
// assert(1.44 == sd1, "Your message here")
// val sd2 = getSquareDouble(5.7)
// assert(32.49 == sd2, "Your message here")

def getSquareDouble(num: Double): Double = num * num

val sd1 = getSquareDouble(1.2)
println(sd1)
assert(1.44 == sd1, "Expected " + 1.44 + " Got " + sd1)
val sd2 = getSquareDouble(5.7)
println(sd2)
assert(32.49 == sd2, "Expected " + 32.49 + " Got " + sd2)

// Differs to Exercise 1 in that method returns a Double instead of an Int