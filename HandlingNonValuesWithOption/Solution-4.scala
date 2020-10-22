// Solution-4.scala

// 4. Create a method that ensures that its argument is numeric or
// alphabetical. Return None for any other characters. Satisfy the
// following tests:
// alphanumeric(0) is Some(0)
// alphanumeric('a') is Some('a')
// alphanumeric('m') is Some('m')
// alphanumeric('$') is None
// alphanumeric('Z') is Some('Z')

import com.atomicscala.AtomicTest._

def alphanumeric(x: Any): Option[Any] = {
    x match {
        case c: Char if (c >= 'a' && c <= 'z') => Some(c)
        case c: Char if (c >= 'A' && c <= 'Z') => Some(c)
        case i: Int => Some(i)
        case _ => None
    }
}

alphanumeric(0) is Some(0)
alphanumeric('a') is Some('a')
alphanumeric('m') is Some('m')
alphanumeric('$') is None
alphanumeric('Z') is Some('Z')