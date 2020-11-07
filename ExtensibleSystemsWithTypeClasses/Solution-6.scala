// Solution-6.scala

// 6. Create a type class trait called Transformer with a method convert,
// but Transformer takes two type parameters: the type it’s
// converting from, and the type it’s converting to. Write a method
// transform that takes any object and its associated Transformer
// and converts the object. Create several classes and their associated
// Transformers and show that your type class system works
// correctly. 

import com.atomicscala.AtomicTest._

trait Transformer[From, To] {
    def convert(from: From): To 
}

def transform[From, To](from: From)(implicit transformer: Transformer[From, To]) =
    transformer.convert(from)

implicit object IntToDouble extends Transformer[Int, Double] {
    def convert(from: Int) = from.toDouble
}

implicit object DoubleToInt extends Transformer[Double, Int] {
    def convert(from: Double) = from.toInt
}

transform(5) is 5.0
transform(3.4) is 3