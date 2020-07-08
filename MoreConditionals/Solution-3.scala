// Solution-3.scala

// 3. Building on the previous exercise, ignore case when testing for
// palindromes. Satisfy the following tests:
// isPalIgnoreCase("Bob") is true
// isPalIgnoreCase("DAD") is true
// isPalIgnoreCase("Blob") is false

import com.atomicscala.AtomicTest._

def isPalIgnoreCase(sentence: String): Boolean = {
    sentence.toUpperCase == sentence.toUpperCase.reverse
}

isPalIgnoreCase("Bob") is true
isPalIgnoreCase("DAD") is true
isPalIgnoreCase("Blob") is false