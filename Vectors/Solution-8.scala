// Solution-8.scala

// 8. Create a Vector containing Strings and apply the sum, min and
// max operations. Explain the results. One of those methods won’t
// work. Why? 

val v1 = Vector("a", "c", "b")

// println(v1.sum)
println(v1.min)
println(v1.max)

// Sum doesn't work as String doesn't have a sum method
// Min and max work by alphabetically sorting