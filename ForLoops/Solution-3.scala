// Solution-3.scala

// 3. Write a for loop that adds the values 0 through 10 (including 10).
// Sum all the values and ensure that it equals 55. Must you use a var
// instead of a val? Why? Satisfy the following test:
// total is 55

import com.atomicscala.AtomicTest._

var total = 0
for (i <- Range(0, 10).inclusive) total += i
total is 55

// var must be used instead of a val as total needs to be modified