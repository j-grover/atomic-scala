// Solution-1.scala

// 1. Create a Vector filled with Chars, one filled with Ints, and one
// filled with Strings. Sort each Vector and produce the min and max
// for each. Write a for loop for each sorted Vector that appends its
// elements, separated by spaces, to a String. 

import com.atomicscala.AtomicTest._

val chars = Vector('a', 'c', 'b')
val ints = Vector(5, 3, 3)
val strings = Vector("a", "dd", "c")

chars.sorted is Vector('a', 'b', 'c')
ints.sorted is Vector(3, 3, 5)
strings.sorted is Vector("a", "c", "dd")

chars.min is 'a'
ints.min is 3
strings.min is "a"

chars.max is 'c'
ints.max is 5
strings.max is "dd"

var charsAppended = ""
for (i <- chars.sorted) charsAppended += i + " "
charsAppended is "a b c "

var intsAppended = ""
for (i <- ints.sorted) intsAppended += i + " "
intsAppended is "3 3 5 "

var stringsAppended = ""
for (i <- strings.sorted) stringsAppended += i + " "
stringsAppended is "a c dd "