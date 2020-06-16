// Solution-4.scala

// 4. Create a new Int variable (var) called v2 initialized to v1. Set v1 to
// 20. Did the value of v2 change?  

var v1 = 5
v1 = 10
println(v1)

val constantv1 = v1
println(constantv1)

v1 = 15
println(v1)
println(constantv1)

var v2 = v1
v1 = 20
print(v2)

// Value of v2 did not change