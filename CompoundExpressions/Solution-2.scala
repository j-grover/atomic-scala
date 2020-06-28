// Solution-2.scala

// 2. Adding to your solution for the previous exercise, check first to see
// if both a and b are less than or equal to c using a single if. If they
// are not, then check to see if either one is less than or equal to c. If
// you set a to 1, b to 5, and c to 5, you should see “both are!” If,
// instead, you set b to 6, you should see “one is and one isn’t!” 

val a = 1
val b = 6
val c = 5

if(a <= c && b <= c) {
    println("both are!")
} else if(a <= c || b <= c) {
    println("one is and one isn't!")
}