// Solution-2.scala

// 2. Create a second instance of Lion and two more Giraffes. Print
// those objects. How do they differ from the original objects that you
// created? 

class Lion
class Giraffe

val lion = new Lion
val lion2 = new Lion
val giraffe = new Giraffe
val giraffe2 = new Giraffe
val giraffe3 = new Giraffe

println(lion)
println(lion2)
println(giraffe)
println(giraffe2)
println(giraffe3)

/* Results in:
Main$$anon$1$Lion@89d9e8
Main$$anon$1$Lion@46a3b3
Main$$anon$1$Giraffe@1a354ca
Main$$anon$1$Giraffe@4f4365
Main$$anon$1$Giraffe@cf859d

Address is different for all the objects
*/