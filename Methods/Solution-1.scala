// Solution-1.scala

// 1. Create a method getSquare that takes an Int argument and returns
// its square. Print your answer. Test using the following code.
// val a = getSquare(3)
// assert(/* fill this in */)
// val b = getSquare(6)
// assert(/* fill this in */)
// val c = getSquare(5)
// assert(/* fill this in */)

def getSquare(num: Int): Int = num * num

val a = getSquare(3)
println(a)
assert(a == 9, "Expected " + 9 + " Got " + a)

val b = getSquare(6)
println(b)
assert(b == 36, "Expected " + 36 + " Got " + b)

val c = getSquare(5)
println(c)
assert(c == 25, "Expected " + 25 + " Got " + c)
