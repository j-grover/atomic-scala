// Solution-4.scala

// 4. In Reaching into Java, we used a math library method Frequency to
// calculate the frequency of “cat” in a List of animals. Use a recursive
// method to do the same thing. Satisfy the following tests:
// calcFreq(animalList, "cat") is 4
// calcFreq(animalList, "dog") is 1
 
import com.atomicscala.AtomicTest._

def calcFreq(animalList: List[String], animal: String, count: Int = 0): Int = {
    if (animalList.isEmpty)
        count
    else if (animalList.head == animal)
        calcFreq(animalList.tail, animal, count + 1)
    else
        calcFreq(animalList.tail, animal, count)
} 

val animalList = List("cat", "dog",
    "cat", "bird", "cat", "cat", "kitten", "mouse")

calcFreq(animalList, "cat") is 4
calcFreq(animalList, "dog") is 1