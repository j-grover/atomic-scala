// Solution-7.scala

// 7. Start with the first example class and transformation in the
// previous exercise. Try adding a second method transform2 that
// produces a different type of result. Why doesn’t this work? Add
// code to fix the problem. 

import com.atomicscala.AtomicTest._

trait Transformer[From, To] {
    def convert(from: From): To 
}

def transform[From, To](from: From)(implicit transformer: Transformer[From, To]) =
    transformer.convert(from)

implicit object IntToDouble extends Transformer[Int, Double] {
    def convert(from: Int) = from.toDouble
}

trait Transformer2[From, To] {
    def convert(from: From): To 
}

def transform2[From, To](from: From)(implicit transformer: Transformer2[From, To]) =
    transformer.convert(from)


implicit object IntToString extends Transformer2[Int, String] {
    def convert(from: Int) = from.toString
}

transform(5) is 5.0
transform2(5) is "5"

/* Without fix, results in:
.\ExtensibleSystemsWithTypeClasses\Solution-7.scala:28: error: ambiguous implicit values:
 both object IntToDouble of type this.IntToDouble.type
 and object IntToString of type this.IntToString.type
 match expected type this.Transformer[Int,To]
transform(5) is 5.0
         ^
.\ExtensibleSystemsWithTypeClasses\Solution-7.scala:29: error: ambiguous implicit values:
 both object IntToDouble of type this.IntToDouble.type
 and object IntToString of type this.IntToString.type
 match expected type this.Transformer[Int,To]
transform2(5) is "5"
          ^
*/