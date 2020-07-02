// Solution-7.scala

// In the exercises for Evaluation Order, you calculated body mass
// index (BMI) using weight in pounds and height in inches. Rewrite
// as a method. Satisfy the following:
// val normal = bmiStatus(160, 68)
// assert("Normal weight" == normal,
//  "Expected Normal weight, Got " + normal)
// val overweight = bmiStatus(180, 60)
// assert("Overweight" == overweight,
//  "Expected Overweight, Got " +
//  overweight)
// val underweight = bmiStatus(100, 68)
// assert("Underweight" == underweight,
//  "Expected Underweight, Got " +
//  underweight)

def bmiStatus(weight: Double, height: Double): String = {
    val bmi = weight / (height * height) * 703.07
    if (bmi < 18.5) "Underweight"
    else if (bmi < 25) "Normal weight"
    else "Overweight"
}

val normal = bmiStatus(160, 68)
println(normal)
assert("Normal weight" == normal,
 "Expected Normal weight, Got " + normal)

val overweight = bmiStatus(180, 60)
println(overweight)
assert("Overweight" == overweight,
 "Expected Overweight, Got " +
 overweight)

val underweight = bmiStatus(100, 68)
println(underweight)
assert("Underweight" == underweight,
 "Expected Underweight, Got " +
 underweight)

// val lbs = 150.0
// val height = 68.0
// val weightStatus = {
//   val bmi = lbs/(height * height) * 703.07
//   if(bmi < 18.5) println("Underweight")
//   else if(bmi < 25) println("Normal weight")
//   else println("Overweight")
// }
// println(weightStatus)