// Solution-3.scala

// 3. Write code that produces a container of containers of containers.
// Use flatten to reduce your container to a single-level sequence.
// Hint: you may want to do this in multiple steps. Satisfy the
// following tests:
// val box1 = Set("shoes", "clothes")
// val box2 = Set("toys", "dishes")
// val box3 = Set("toys", "games", "books")
// val attic = Set(box1, box2)
// val basement = Set(box3)
// val house = Set(attic, basement)
// Set("shoes", "clothes", "toys",
//  "dishes") is attic.flatten
// Set("toys", "games", "books") is
//  basement.flatten
// Set("shoes", "clothes", "toys",
//  "dishes", "games", "books") is
// /* fill this in -- call flatten */

import com.atomicscala.AtomicTest._

val box1 = Set("shoes", "clothes")
val box2 = Set("toys", "dishes")
val box3 = Set("toys", "games", "books")

val attic = Set(box1, box2)
val basement = Set(box3)
val house = Set(attic, basement)

Set("shoes", "clothes", "toys", "dishes") is attic.flatten
Set("toys", "games", "books") is basement.flatten
Set("shoes", "clothes", "toys", "dishes", "games", "books") is
    house.flatten.flatten