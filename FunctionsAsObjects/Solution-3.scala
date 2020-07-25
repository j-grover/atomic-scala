// Solution-3.scala

// 3. Create an anonymous function that calculates age in “dog years”
// (by multiplying years by 7). Assign it to a val and then call your
// function. Satisfy the following test:
// val dogYears = // Your function here
// dogYears(10) is 70

import com.atomicscala.AtomicTest._

val dogYears = (years: Int) => years * 7

dogYears(10) is 70
