// Solution-4.scala

// 4. Write a for loop that adds even numbers between 1 and 10
// (including 10). Sum all the values and ensure that it equals 30.
// Hint: this conditional expression determines if a number is even:
// if (number % 2 == 0)
// The % (modulo) operator checks to see if there is a remainder
// when you divide number by 2. Satisfy the following:
// totalEvens is 30

import com.atomicscala.AtomicTest._

var totalEvens = 0
for (i <- Range(1, 10).inclusive) {
    if (i % 2 == 0) totalEvens += i
}
totalEvens is 30