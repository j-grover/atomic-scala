// Solution-1.scala

// 1. Modify Maps.scala so the numbers are keys and the strings are
// values. 
 
import com.atomicscala.AtomicTest._

val constants = Map(3.141 -> "Pi",
    2.718 -> "e", 1.618 -> "phi")

Map((3.141, "Pi"), (2.718, "e"),
    (1.618, "phi")) is constants

Vector((3.141, "Pi"), (2.718, "e"),
    (1.618, "phi")).toMap is constants

// Look up a value from a key:
constants(2.718) is "e"

constants.keys is "Set(3.141, 2.718, 1.618)"

constants.values is
"Iterable(Pi, e, phi)"

// Iterate through key-value pairs:
(for (pair <- constants)
    yield pair.toString) is
    "List((3.141,Pi), (2.718,e), (1.618,phi))"

// Unpack during iteration:
(for ((k,v) <- constants)
    yield k + ": " + v) is
    "List(3.141: Pi, 2.718: e, 1.618: phi)"
