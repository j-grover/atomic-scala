// Solution-9.scala

// 9. Use pluralize from the previous exercise. Use foreach on a Vector
// of Strings and print the plural form of each word. Satisfy the
// following test:
// var s = ""
// val words = Vector("word", "cat", "animal")
// words.foreach(/* Fill this in */)
// s is "words cats animals " 

import com.atomicscala.AtomicTest._


var s = ""
val words = Vector("word", "cat", "animal")
words.foreach((word: String) => s += word + "s ")
s is "words cats animals " 