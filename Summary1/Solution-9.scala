// Solution-9.scala

// 9. Modify weightStatus in CompoundBMI.scala to produce Unit
// instead of String. 

val lbs = 150.0
val height = 68.0
val weightStatus = {
  val bmi = lbs/(height * height) * 703.07
  if(bmi < 18.5) println("Underweight")
  else if(bmi < 25) println("Normal weight")
  else println("Overweight")
}
println(weightStatus)

/* Results in:
Normal weight
()
*/