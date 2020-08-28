// Solution-1.scala

// 1. Modify House5.scala from Composition by adding Enumerations
// for different types of food and utensils. Use type constraints for
// Clean and Store as shown in Resilience.scala. 
 
import com.atomicscala.AtomicTest._

trait Building
trait Room
trait Storage
trait Sink
trait Store[T]
trait Cook[T]
trait Clean[T]

trait Consumable
trait Fillable

object Fruit extends Enumeration {
    case class _Val() extends Val
        with Consumable
    type Fruit = _Val
    val apple, orange, banana = _Val()
}

object Pot extends Enumeration {
    case class _Val() extends Val
        with Fillable
    type Pot = _Val
    val small, medium, large = _Val()
}

trait Food[F <: Consumable] extends Store[F]
    with Clean[F] with Cook[F]

trait Utensil[U <: Fillable] extends Store[U]
    with Clean[U] with Cook[U]

trait Kitchen extends Room {
    val storage: Storage
    val sinks: Vector[Sink]
    val food: Food[Consumable]
    val utensils: Vector[Utensil[Fillable]]
}

trait House extends Building {
    val kitchens: Vector[Kitchen]
}