// Solution-1.scala

// 1. Create sets for fruits, vegetables, and meats. Create a grocery list,
// and calculate what percentage of your list is in each category,
// including an “other” category determined by not matching any
// category. Satisfy the following tests:
// val fruits = Set("apple", "orange",
//  "banana", "kiwi")
// val vegetables = Set("beans", "peas",
//  "carrots", "sweet potatoes",
//  "asparagus", "spinach")
// val meats = Set("beef", "chicken")
// val groceryCart = Set("apple",
//  "pretzels", "bread", "orange", "beef",
//  "beans", "asparagus", "sweet potatoes",
//  "spinach", "carrots")
// percentMeat(groceryCart) is 10.0
// percentFruit(groceryCart) is 20.0
// percentVeggies(groceryCart) is 50.0
// percentOther(groceryCart) is 20.0

import com.atomicscala.AtomicTest._

val fruits = Set("apple", "orange", "banana", "kiwi")
val vegetables = Set("beans", "peas",
    "carrots", "sweet potatoes",
    "asparagus", "spinach")
val meats = Set("beef", "chicken")

val groceryCart = Set("apple",
    "pretzels", "bread", "orange", "beef",
    "beans", "asparagus", "sweet potatoes",
    "spinach", "carrots")

def percentMeat(groceryList: Set[String]): Double = {
    (meats & groceryList).size / groceryList.size.toDouble * 100
}

def percentFruit(groceryList: Set[String]): Double = {
    (fruits & groceryList).size / groceryList.size.toDouble * 100
}

def percentVeggies(groceryList: Set[String]): Double = {
    (vegetables & groceryList).size / groceryList.size.toDouble * 100
}

def percentOther(groceryList: Set[String]): Double = {
    (groceryList &~ meats &~ fruits &~ vegetables).size / groceryList.size.toDouble * 100 
}

percentMeat(groceryCart) is 10.0
percentFruit(groceryCart) is 20.0
percentVeggies(groceryCart) is 50.0
percentOther(groceryCart) is 20.0