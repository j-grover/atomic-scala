// Solution-2.scala

// 2. Palindromes are words or phrases that read the same forward and
// backward. Some examples include “mom” and “dad.” Write a
// method to test words or phrases for palindromes. Hint: String’s
// reverse method may prove useful here. Use AtomicTest to check
// your solution (remember to import it!). Satisfy the following tests:
// isPalindrome("mom") is true
// isPalindrome("dad") is true
// isPalindrome("street") is false

import com.atomicscala.AtomicTest._

def isPalindrome(sentence: String): Boolean = sentence == sentence.reverse

isPalindrome("mom") is true
isPalindrome("dad") is true
isPalindrome("street") is false