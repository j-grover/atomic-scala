// Solution-6.scala

// 6. If you didn’t use Range for Exercise 5, rewrite using Range. If you
// did use Range, rewrite the for using to or until. 

import com.atomicscala.AtomicTest._

var evens = 0
var odds = 0

for (i <- 1 until 11) {
    if (i % 2 == 0) evens += i
    else odds += i
}

evens is 30
odds is 25
(evens + odds) is 55