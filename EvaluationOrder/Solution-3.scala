// Solution-3.scala

// 3. Write an expression that evaluates to true if the sky is either
// “sunny” or “partly cloudy” and the temperature is either more than
// 80 degrees or less than 20 degrees. 


val sky = "partly cloudy"
val temperature = 10

val exp =
    (sky == "sunny" ||
    sky == "partly cloudy") && 
    (temperature > 80 ||
    temperature < 20)

println(exp)