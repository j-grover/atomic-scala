// Solution-1.scala

// 1. Use the code from Compiled.scala. Compile it using scalac, as
// described above. Run it with the shell command scala WhenAmI. 

object WhenAmI extends App {
    hi
    println(new java.util.Date())
    def hi = println("Hello! It's:")
}