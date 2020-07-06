// Solution-5.scala

// 5. Write a for loop to add even numbers between 1 and 10 (including
// 10) and odd numbers between 1 and 10. Calculate a sum for the
// even numbers and a sum for the odd numbers. Did you write two
// for loops? If so, try rewriting this with a single for loop. Satisfy the
// following tests:
// evens is 30
// odds is 25
// (evens + odds) is 55 

import com.atomicscala.AtomicTest._

var evens = 0
var odds = 0

for (i <- Range(1, 10).inclusive) {
    if (i % 2 == 0) evens += i
    else odds += i
}

evens is 30
odds is 25
(evens + odds) is 55