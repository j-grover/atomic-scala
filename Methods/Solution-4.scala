// Solution-4.scala

// 4. Create a method getMe that takes a String and returns the same
// String, but all in lowercase letters (There’s a String method called
// toLowerCase). Print your answer. Satisfy the following:
// val g1 = getMe("abraCaDabra")
// assert("abracadabra" == g1,
//  "Your message here")
// val g2 = getMe("zyxwVUT")
// assert("zyxwvut"== g2, "Your message here")

def getMe(chars: String): String = chars.toLowerCase

val g1 = getMe("abraCaDabra")
println(g1)
assert("abracadabra" == g1, "Expected " + "abracadabra" + " Got " + g1)
val g2 = getMe("zyxwVUT")
println(g2)
assert("zyxwvut"== g2, "Expected " + "zyxwvut" + " Got " + g2)