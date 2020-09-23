// Solution-1.scala

// 1. Write a recursive method max to find the maximum value in a
// List, without using List’s max method. Satisfy the following tests:
// val aList = List(10, 20, 45, 15, 30)
// max(aList) is 45

import com.atomicscala.AtomicTest._

def max(aList: List[Int], currMax: Int = 0): Int =
    if (aList.isEmpty)
        currMax
    else if (aList.head > currMax)
        max(aList.tail, aList.head)
    else
        max(aList.tail, currMax)

val aList = List(10, 20, 45, 15, 30)
max(aList) is 45