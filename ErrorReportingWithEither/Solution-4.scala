// Solution-4.scala

// 4. Adding to your solution for the previous exercise, write a
// testLetters method that separates the mapping into Left and Right,
// as you saw in EitherMap.scala. Satisfy the following tests:
// testLetters(0) is "Vowel: a"
// testLetters(4) is "Vowel: e"
// testLetters(13) is "Consonant: n" 

import com.atomicscala.AtomicTest._

var letters = 'a' to 'z' map {
    case l if List('a', 'e', 'i', 'o', 'u').contains(l) => Left(l)
    case l => Right(l)
}

def testLetters(idx: Int) = {
    letters(idx) match {
        case Left(l) => s"Vowel: $l"
        case Right(l) => s"Consonant: $l"
    }
}

testLetters(0) is "Vowel: a"
testLetters(4) is "Vowel: e"
testLetters(13) is "Consonant: n" 