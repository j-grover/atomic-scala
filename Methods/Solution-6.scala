// Solution-6.scala

// Create a method manyTimesString that takes a String and an Int
// as arguments and returns the String duplicated that many times.
// Print your answer. Satisfy the following:
// val m1 = manyTimesString("abc", 3)
// assert("abcabcabc" == m1,
//  "Your message here")
// val m2 = manyTimesString("123", 2)
// assert("123123" == m2, "Your message here") 

def manyTimesString(str: String, num: Int): String = str * num

val m1 = manyTimesString("abc", 3)
println(m1)
assert("abcabcabc" == m1, "Expected " + "abcabcabc" + " Got " + m1)
val m2 = manyTimesString("123", 2)
println(m2)
assert("123123" == m2, "Expected " + "123123" + " Got " + m2) 