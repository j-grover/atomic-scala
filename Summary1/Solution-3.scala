// Solution-3.scala

// 3. Create a var and initialize it to an Int, then try reassigning to a
// Double. What happened? 

var value: Int = 5
value = 4.0

/* Results in:
Solution-3.scala:7: error: type mismatch;
 found   : Double(4.0)
 required: Int
value = 4.0
        ^
*/