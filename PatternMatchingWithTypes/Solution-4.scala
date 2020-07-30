// Solution-4.scala

// 4. Create a new method quantify to return “small” if the argument is
// less than 100, “medium” if the argument is between 100 and 1000,
// and “large” if the argument is greater than 1000. Support both
// Doubles and Ints. Satisfy the following tests:
// quantify(100) is "medium"
// quantify(20.56) is "small"
// quantify(100000) is "large"
// quantify(-15999) is "small"

import com.atomicscala.AtomicTest._

def quantify(x: Any): String = {
    x match {
        case i: Int if (i < 100)         => "small"
        case i: Int if (i < 1000)        => "medium"
        case i: Int if (i >= 1000)       => "large"
        case d: Double if (d < 100.0)    => "small"
        case d: Double if (d < 1000.0)   => "medium"
        case d: Double if (d >= 1000.0)  => "large"
    }
}

quantify(100) is "medium"
quantify(20.56) is "small"
quantify(100000) is "large"
quantify(-15999) is "small"