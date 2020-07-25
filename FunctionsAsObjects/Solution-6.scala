// Solution-6.scala

// 6. Create an anonymous function with three arguments
// (temperature, low, and high). The anonymous function will return
// true if the temperature is between high and low, and false
// otherwise. Assign the anonymous function to a def and then call
// your function. Satisfy the following tests:
// between(70, 80, 90) is false
// between(70, 60, 90) is true

import com.atomicscala.AtomicTest._

val between = (temperature: Int, low: Int, high: Int) => 
                if (low <= temperature && temperature <= high) true 
                else false

between(70, 80, 90) is false
between(70, 60, 90) is true