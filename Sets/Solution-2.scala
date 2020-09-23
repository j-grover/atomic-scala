// Solution-2.scala

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

val fruits = Set("apple", "orange", "banana", "kiwi")
val vegetables = Set("beans", "peas",
    "carrots", "sweet potatoes",
    "asparagus", "spinach")
val meats = Set("beef", "chicken")

val vegetarian = Set("kidney beans", "black beans", "tofu")
val groceryCart2 = Set("apple",
    "pretzels", "bread", "orange", "beef",
    "beans", "asparagus", "sweet potatoes",
    "kidney beans", "black beans")

val protein = meats | vegetarian

def percentMeat(groceryList: Set[String]): Double = {
    (meats & groceryList).size / groceryList.size.toDouble * 100
}

def percentVegetarian(groceryList: Set[String]): Double = {
    (vegetarian & groceryList).size / groceryList.size.toDouble * 100
}

def percentProtein(groceryList: Set[String]): Double = {
    (protein & groceryList).size / groceryList.size.toDouble * 100
}

percentMeat(groceryCart2) is 10.0 
percentVegetarian(groceryCart2) is 20.0
percentProtein(groceryCart2) is 30.0