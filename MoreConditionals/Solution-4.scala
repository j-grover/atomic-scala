// Solution-4.scala

// 4. Building on the previous exercise, strip out special characters
// before palindrome testing. Here is sample code and tests: (Hint: In
// integer values, ‘A’ is 65, ‘B’ is 66, … ‘a’ is 97 … ‘z’ is 122. ‘0’ is 48 …
// ‘9’ is 57)
// var createdStr = ""
// for (c <- str) {
//  // Convert to Int for comparison:
//  val theValue = c.toInt
//  if (/* Check for letters */) {
//  createdStr += c
//  }
//  else if (/* check for numbers */) {
//  createdStr += c
//  }
// }
// isPalIgnoreSpecial("Madam I'm adam") is
// true
// isPalIgnoreSpecial("trees") is false 

import com.atomicscala.AtomicTest._

def isPalIgnoreSpecial(str: String): Boolean = {
    var createdStr = ""
    for (c <- str) {
        val theValue = c.toInt
        if ((65 <= theValue && theValue <= 91) || 
            (97 <= theValue && theValue <= 122)) {
            createdStr += c
        }
        else if (48 <= theValue && theValue <= 57) {
            createdStr += c
        }
    }
    createdStr.toUpperCase == createdStr.toUpperCase.reverse
}

isPalIgnoreSpecial("Madam I'm adam") is true
isPalIgnoreSpecial("trees") is false 