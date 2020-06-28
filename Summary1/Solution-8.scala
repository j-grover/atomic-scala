// Solution-8.scala

// 8. What happens if you try to store the number 15.4 in an Int value? 

val value: Int = 15.4
println(value)

/* Results in:
Solution-8.scala:5: error: type mismatch;
 found   : Double(15.4)
 required: Int
val value: Int = 15.4
                 ^
*/