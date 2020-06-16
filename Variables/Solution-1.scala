// Solution-1.scala

// 1. Create an Int value (val) and set it to 5. Try to update that number
// to 10. What happened? How would you solve this problem? 

val value: Int = 5
value = 10

/* Results in:
Solution-1.scala:7: error: reassignment to val
value = 10
      ^
*/

// Can be solved by changing value to var