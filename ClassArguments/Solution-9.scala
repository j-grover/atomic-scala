// Solution-9.scala

// 9. Write a method that squares a variable argument list of numbers
// and returns the sum. Satisfy the following tests:
// squareThem(2) is 4
// squareThem(2, 4) is 20
// squareThem(1, 2, 4) is 21

import com.atomicscala.AtomicTest._

def squareThem(nums: Int*) = {
  var result = 0
  for (n <- nums)
    result += n * n
  result
}

squareThem(2) is 4
squareThem(2, 4) is 20
squareThem(1, 2, 4) is 21