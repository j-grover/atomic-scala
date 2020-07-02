// Solution-5.scala

// 5. Create a method addStrings that takes two Strings as arguments,
// and returns the Strings appended (added) together. Print your
// answer. Satisfy the following:
// val s1 = addStrings("abc", "def")
// assert(/* fill this in */)
// val s2 = addStrings("zyx", "abc")
// assert(/* fill this in */)

def addStrings(str1: String, str2: String): String = str1 + str2

val s1 = addStrings("abc", "def")
println(s1)
assert(s1 == "abcdef", "Expected " + "abcdef" + " Got " + s1)
val s2 = addStrings("zyx", "abc")
println(s2)
assert(s2 == "zyxabc", "Expected " + "zyxabc" + " Got " + s2)