// Solution-3.scala

// 3. Create a method isArg1GreaterThanArg2 that takes two Double
// arguments. Return true if the first argument is greater than the
// second. Return false otherwise. Print your answer. Satisfy the
// following:
// val t1 = isArg1GreaterThanArg2(4.1, 4.12)
// assert(/* fill this in */)
// val t2 = isArg1GreaterThanArg2(2.1, 1.2)
// assert(/* fill this in */)

def isArg1GreaterThanArg2(arg1: Double, arg2: Double): Boolean = {
    arg1 > arg2
}

val t1 = isArg1GreaterThanArg2(4.1, 4.12)
println(t1)
assert(t1 == false, "Expected " + false + " Got " + t1)
val t2 = isArg1GreaterThanArg2(2.1, 1.2)
println(t2)
assert(t2 == true, "Expected " + true + " Got " + t2)