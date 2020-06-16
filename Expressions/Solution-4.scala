// Solution-4.scala

// 4. Combine the above three expressions into a multiline expression
// that returns miles.  

val yardsPerMile = {
    val feetPerMile = 5280
    feetPerMile / 3.0
}

val miles = 2000 / yardsPerMile
println(miles)