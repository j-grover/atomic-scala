// Solution-6.scala

// 6. What happens if you try to store the String “maybe” in a Boolean? 

val value:Boolean = "maybe"

/* Results in:
Solution-6.scala:5: error: type mismatch;
 found   : String("maybe")
 required: Boolean
val value:Boolean = "maybe"
                    ^
*/