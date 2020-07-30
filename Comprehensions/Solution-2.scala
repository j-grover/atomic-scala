// Solution-2.scala

// 2. Modify yielding2 to accept a List instead of a Vector. Return a List.
// Satisfy the following test:
// val theList =
//  List(1,2,3,5,6,7,8,10,13,14,17)
// yielding2(theList) is List(1,3,5,7)

import com.atomicscala.AtomicTest._

def yielding2(v: List[Int]): List[Int] = {
    for {
        n <- v
        if n < 10
        isOdd = (n % 2 != 0)
        if (isOdd)
    } yield n
}

val theList = List(1, 2, 3, 5, 6, 7, 8, 10, 13, 14, 17)
yielding2(theList) is List(1, 3, 5, 7)
