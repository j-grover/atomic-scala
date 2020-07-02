// Solution-5.scala

// 5. Building from Exercise 3, create a String object s3 by calling
// toUpperCase on s1. Call contentEquals to compare the Strings s1
// and s3. If they match, print “s1 and s3 are equal.” If they do not
// match, print “s1 and s3 are not equal.” Hint: use s1.toUpperCase. 

var s1 = "Sally"
var s3 = s1.toUpperCase

if (s1.contentEquals(s3)) println("s1 and s3 are equal")
else println("s1 and s3 are not equal")