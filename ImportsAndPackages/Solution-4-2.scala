// Solution-4-2.scala

// 4. Create your own package containing three trivial classes (just
// define the classes, don’t give them bodies). Use the techniques in
// this atom to import one class, two classes, and all classes, and
// show that you’ve successfully imported them in each case.

// Import two classes
import com.atomicscala.trivial.{Class1, Class2}

val class1 = new Class1
val class2 = new Class2
println(class1)
println(class2)