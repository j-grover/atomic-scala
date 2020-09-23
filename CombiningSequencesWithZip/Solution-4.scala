// Solution-4.scala

// 4. Taking a similar approach as ZipMap.scala, modify
// IndexWithZip.scala to use the result of zipWithIndex. 
 
import com.atomicscala.AtomicTest._

def number(s: String) =
    s.zipWithIndex.map {
        case (c, n) => (n, c)
    }

number("Howdy") is
Vector((0,'H'), (1,'o'), (2,'w'),
       (3,'d'), (4,'y'))