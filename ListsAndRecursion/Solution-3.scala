// Solution-3.scala

// 3. In map and reduce, you implemented a method sumIt that used
// reduce to do a summation. There, you used a variable argument
// list. Reimplement using a List. Compare this to your solution for
// Exercise 1, above. Satisfy the following tests:
// sumIt(List(1, 2, 3)) is 6
// sumIt(List(45, 45, 45, 60)) is 195

import com.atomicscala.AtomicTest._

def sumIt(nums: List[Int]): Int = {
    nums.reduce((sum, x) => sum + x)
}

sumIt(List(1, 2, 3)) is 6
sumIt(List(45, 45, 45, 60)) is 195

// Reduce solution is quicker to implement but Exercise 1 solution could be
// more intuitive