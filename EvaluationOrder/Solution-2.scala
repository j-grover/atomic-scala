// Solution-2.scala

// 2. Write an expression that evaluates to true if the sky is either
// “sunny” or “partly cloudy” and the temperature is more than 80
// degrees. 

val sky = "partly cloudy"
val temperature = 90

val exp = (sky == "sunny" || sky == "partly cloudy") && temperature > 80
println(exp)