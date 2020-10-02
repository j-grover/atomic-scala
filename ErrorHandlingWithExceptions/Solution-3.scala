// Solution-3.scala

// 3. Create a Vector containing some elements. Try to index outside
// the range of that Vector. Now write code to catch the exception. 

import com.atomicscala.AtomicTest._

val vec = Vector(0, 1, 2)

val result = try {
    vec(5)
} catch {
    case e: IndexOutOfBoundsException => "Index exception"
}

result is "Index exception"