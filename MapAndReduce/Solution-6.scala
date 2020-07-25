// Solution-6.scala

// 6. Use reduce to implement a method sumIt that takes a variable
// argument list and sums those arguments. Satisfy the following
// tests:
// sumIt(1, 2, 3) is 6
// sumIt(45, 45, 45, 60) is 195

import com.atomicscala.AtomicTest._

def sumIt(nums: Int*): Int = {
    nums.reduce((sum, x) => sum + x)
}

sumIt(1, 2, 3) is 6
sumIt(45, 45, 45, 60) is 195